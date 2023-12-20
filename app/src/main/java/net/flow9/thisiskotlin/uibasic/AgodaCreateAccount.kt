package net.flow9.thisiskotlin.uibasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast


class AgodaCreateAccount : AppCompatActivity() {

    lateinit var lastNameInput: EditText
    lateinit var familyNameInput: EditText
    lateinit var userIdInput: EditText
    lateinit var passwordInput1: EditText
    lateinit var passwordInput2: EditText
    lateinit var create: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agoda_create_account)

        lastNameInput = findViewById(R.id.tv_name_input)
        familyNameInput = findViewById(R.id.tv_familyname_input)
        userIdInput = findViewById(R.id.tv_id_input)
        passwordInput1 = findViewById(R.id.tv_pw_input)
        passwordInput2 = findViewById(R.id.tv_pw_input_confirm)
        create = findViewById(R.id.btn_signup_data_trans)

        create.setOnClickListener {
            createAcc()
        }
    }
    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }


    fun createAcc() {
        val lastNameInput = lastNameInput.text.toString()
        val familyNameInput = familyNameInput.text.toString()
        val userIdInput = userIdInput.text.toString()
        val passwordInput1 = passwordInput1.text.toString()
        val passwordInput2 = passwordInput2.text.toString()
        //위젯 값을 스트링으로 바꿔줘야함


        when {
            //when()비워둬도 쓸수 있는거 아닌가? 왜 when{ 으로 컴파일러에서 바꾸라고 하는건지?
            lastNameInput.isEmpty() -> {
                showToast("이름 없어?")
            }
            familyNameInput.isEmpty() -> {
                showToast("이름 없어?")
            }
            userIdInput.isEmpty() -> {
                showToast("아이디 없어?")
            }
            passwordInput1.isEmpty() -> {
                showToast("비번 입력해야지?")
            }
//            passwordInput2.isEmpty() -> {
//                showToast("거 비번 똑바로 치소11")
//            }
            passwordInput1 != passwordInput2 -> {
                showToast("거 비번 똑바로 치소")
            }
            lastNameInput.isNotEmpty() && familyNameInput.isNotEmpty() && userIdInput.isNotEmpty() && passwordInput1.isNotEmpty() && passwordInput2.isNotEmpty() -> {
                showToast("로그확인용 토스트 냠냠 아이디 생성 드가자~")

                //데이터 전달 뿅뿅
                val toss = Intent(this, AgodaMyInfo::class.java)
                toss.putExtra("lastNameInput", lastNameInput)
                toss.putExtra("familyNameInput", familyNameInput)
                toss.putExtra("userIdInput", userIdInput)
                //성 이름 아이디 뿅뿅

                //doAction8()
                //여기다가 doAction의 인텐트 내용 이동
                startActivity(toss)
                //로그인 입력을 안받아서 이동이 튕기는 듯

                //값 다있어야지 인포페이지로 간당, 근대 왜 오류?
            }
            else -> showToast("마 장난치나?\n똑바로 해라")
        }
    }





/* 액션 메소드를 따로 빼서 썼는데 createAcc에 위젯 데이터를 가져올 수가 없음, 할려면 여기다 위젯.string 다 부르고 하면 할수는 있는데 구지?
    fun doAction8() {
        //데이터 타입을 넣으면 메서드 호출 에러가 뜨고 안넣으면 xml에서 온클릭 버튼 주소 할당이 안됌;;
        //추가 view 데이터 타입 안넣고 버튼으로 쓰면 에러는 안나는데 앱 크래시 남!!!!

        //토스트 메서드로 빼고 위에 로그인 메서드에서 사용함
        val toss = Intent(this, AgodaLogin::class.java)
        toss.putExtra("lastNameInput", lastNameInput)
        toss.putExtra("familyNameInput", familyNameInput)
        toss.putExtra("userIdInput", userIdInput)
        startActivity(intent)
    }*/


}