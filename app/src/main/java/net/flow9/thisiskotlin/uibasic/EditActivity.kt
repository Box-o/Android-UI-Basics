package net.flow9.thisiskotlin.uibasic

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class EditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.text_views)

        val btn = findViewById<Button>(R.id.btn_submit)
        btn.setOnClickListener {
            Toast.makeText(applicationContext, "Submitted Successfully", Toast.LENGTH_SHORT).show()
        }
    }
//    fun doAction3(v:View){
//        Toast.makeText(applicationContext, "Submitted Successfully", Toast.LENGTH_SHORT).show()
//        //applicationContext = 앱 전역 사용
//        //Toast.LENGTH_SHORT = 토스트 표시 시간, Short,Long 두 가지
//        //show() = 화면에 표시 명령 메서드
//    }
}


/*
활성화 된 코드는 btn 불변 변수에 findViewById로 Button을 할당해서 btn+메서드로 Toast를 실행시킴, 람다 표현식이라 부른다고 함
주석 처리된 코드는 doAction3 함수로 매개변수 v로 View라는 변수타입을 지정한다
지금까지 {}로 감싸는 코드를 람다 표현식으로 알고 있었는데?
*/