package net.flow9.thisiskotlin.uibasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //클래스 생성없이 xml바로 뿌릴려면 여기다 이름 써줘야 한다
    }

    fun doAction(view: View) {
        Toast.makeText(view.context, "자 드가자", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, SizeActivity::class.java)
        startActivity(intent)
    }
/* 이렇게 사용도 가능함
        val btnAction = findViewById<Button>(R.id.버튼아이디)
        btn.setOnClickListener{
        val intent = Intent(this, SizeActivity::class.java)
        startActivity(intent)
    }
*/

    fun doAction2(view: View) {
        Toast.makeText(view.context, "자 드가자", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, EditActivity::class.java)
        startActivity(intent)
    }
    fun doAction3(view: View) {
        Toast.makeText(view.context, "자 드가자", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, ViewsArrange::class.java)
        startActivity(intent)
    }
    fun doAction4(view: View) {
        Toast.makeText(view.context, "자 드가자", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, AgodaClone::class.java)
        startActivity(intent)
    }
    fun doAction6(view: View) {
        Toast.makeText(view.context, "자 드가자", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, AgodaCloneLinear::class.java)
        startActivity(intent)
    }
}

/* 암시적 인텐트로 다른 엑티비티 시작 = 이건 스텐다드에 사용하면 될듯

xml에서는 아래 두개의 속성을 부여
//android:id="@+id/아이디 아무거나"
//android:onClick="doOnBtnClick"

코드는 아래 참고
    fun doOnBtnClick(view: View) {
        when (view.getId()) {
            R.id.buttonDialActivity -> {                 // 114 전화번호로 다이얼 작업을 수행할 수 있도록 인텐트 설정
                val call_intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:114"))
                startActivity(call_intent)
            }
            R.id.buttonMapActivity -> {                // 주어진 위도,경도 위치로 지도를 보여줄 수 있도록 인텐트 설정
                val map_intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:37.565350, 127.01445"))
                startActivity(map_intent)
            }
        }
    }
 */