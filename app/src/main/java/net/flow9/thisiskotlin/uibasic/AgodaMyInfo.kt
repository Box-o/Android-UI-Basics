package net.flow9.thisiskotlin.uibasic

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AgodaMyInfo : AppCompatActivity() {

    lateinit var loginBGM: MediaPlayer
    lateinit var gotologinbtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agoda_my_info)

        gotologinbtn = findViewById(R.id.gotosignin)

        gotologinbtn.setOnClickListener {
            gotogo()
        }

        var lastNameInput = intent.getStringExtra("lastNameInput")
        var familyNameInput = intent.getStringExtra("familyNameInput")
        var userIdInput = intent.getStringExtra("userIdInput")

        val tvLastName = findViewById<TextView>(R.id.namename)
        tvLastName.text = "이름: $familyNameInput$lastNameInput"
//        val tvFamilyName = findViewById<TextView>(R.id.ididid)
//        tvFamilyName.text = "성: $familyNameInput"
        val tvId = findViewById<TextView>(R.id.ididid)
        tvId.text = "아이디: $userIdInput"

        //        loginBGM = MediaPlayer.create(this, R.raw.pokemon)
//        loginBGM.start()
//        loginBGM.setOnCompletionListener {
//            loginBGM.start()
        //무한재생 조아요, 근데 뒤로가기 해도 안끝남 흐름 중 디스트로이 하는 방법 찾아보자
//        }
//    }
    }

        fun gotogo() {
            val gotologg = Intent(this, AgodaLogin::class.java)
            startActivity(gotologg)
            //버튼누르면 로그인 페이지로 이동

//            val toss = Intent(this, AgodaLogin::class.java)
//            toss.putExtra("lastNameInput", lastNameInput)
//            toss.putExtra("familyNameInput", familyNameInput)
//            toss.putExtra("userIdInput", userIdInput)
        }




}


/*
                val toss = Intent(this, AgodaMyInfo::class.java)
                toss.putExtra("lastNameInput", lastNameInput)
                toss.putExtra("familyNameInput", familyNameInput)
                toss.putExtra("userIdInput", userIdInput)
*/
