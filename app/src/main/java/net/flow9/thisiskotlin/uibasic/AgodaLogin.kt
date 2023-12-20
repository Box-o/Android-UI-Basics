package net.flow9.thisiskotlin.uibasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import android.widget.Button
import android.widget.EditText

class AgodaLogin : AppCompatActivity() {

    lateinit var userIdInput: EditText
    lateinit var passwordInput: EditText
    lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agoda_login)

        // 뷰 초기화
        userIdInput = findViewById(R.id.tv_id_input)
        passwordInput = findViewById(R.id.tv_pw_input)
        loginButton = findViewById(R.id.btn_login)
        //위젯을 코드에서 사용하기 위한 변수 할당으로 보면된다

        loginButton.setOnClickListener {
            logininin()
        }
    }

    fun logininin() {
        val userId = userIdInput.text.toString()
        val password = passwordInput.text.toString()

        when{
            //when()비워둬도 쓸수 있는거 아닌가? 왜 when{ 으로 컴파일러에서 바꾸라고 하는건지?
            userId.isNotEmpty() && password.isNotEmpty() -> {
                showToast("로그확인용 토스트 냠냠 로그인 드가자~")
                doAction7()
                //값 다있어야지 인포페이지로 간당, 근대 왜 오류?
            }
            userId.isNotEmpty() -> showToast("비밀번호는 엿바꿔 먹었냐?")
            password.isNotEmpty() -> showToast("아이디는 엿바꿔 먹었냐?")
            else -> showToast("마 장난치나?\n똑바로 해라")
        }
    }
    fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    fun doAction5_1(view: View) {
        //데이터 타입을 넣으면 메서드 호출 에러가 뜨고 안넣으면 xml에서 온클릭 버튼 주소 할당이 안됌;;
        //추가 view 데이터 타입 안넣고 버튼으로 쓰면 에러는 안나는데 앱 크래시 남!!!!

        //토스트 메서드로 빼고 위에 로그인 메서드에서 사용함
        val intent = Intent(this, AgodaCreateAccount::class.java)
        startActivity(intent)
    }


    ///////////////////////////////////////////////////////////////////////////////
    ////////////////////////   까먹지 말고 튜터님에게 물어볼 것   //////////////////////////
    ///////////////////////////////////////////////////////////////////////////////
    fun doAction7() {
        //데이터 타입을 넣으면 메서드 호출 에러가 뜨고 안넣으면 xml에서 온클릭 버튼 주소 할당이 안됌;;
        //추가 view 데이터 타입 안넣고 버튼으로 쓰면 에러는 안나는데 앱 크래시 남!!!!

        //토스트 메서드로 빼고 위에 로그인 메서드에서 사용함
        val intent = Intent(this, AgodaMyInfo::class.java)
        startActivity(intent)
    }

//    fun doAction7_1(view: View) {
//        //새로운 엑티비티로 가기 위해서 빈 뷰를 생성자로 만들어 두고 밑에 인텐트로 가져온다
//        //추가 view 데이터 타입 안넣고 버튼으로 쓰면 에러는 안나는데 앱 크래시 남!!!!
//
//        //토스트 메서드로 빼고 위에 로그인 메서드에서 사용함
//        val intent = Intent(this, AgodaMyInfo::class.java)
//        startActivity(intent)
//    }
    ///////////////////////////////////////////////////////////////////////////////
    ////////////////////////   까먹지 말고 튜터님에게 물어볼 것   //////////////////////////
    ///////////////////////////////////////////////////////////////////////////////
    //lateval에 0 넣어두고 조건문 충족시 1 반환해서 펑션 하나로 만들 수 있을것 같은데 아직안해봄
    //바보같은생각인게 위에서 변수에 위젯할당해서 버튼에다가 옽클릭 안줘도 실행잘됨 해결완~!!



}

