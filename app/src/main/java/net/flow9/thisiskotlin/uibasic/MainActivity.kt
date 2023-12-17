package net.flow9.thisiskotlin.uibasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
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
}