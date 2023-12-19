package net.flow9.thisiskotlin.uibasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.ImageView
import android.view.MotionEvent
import android.view.View


class AgodaClone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agoda_clone)
/*

        val hotell : ImageView = findViewById(R.id.iv_hotel)
//        hotell.setOnClickListener {
//            hotell.setImageDrawable(R.drawable.agoda_hotelonclick)
//        }
        hotell.setOnClickListener {
            hotell.setImageResurce(R.drawable.agoda_hotelonclick)
        }
//이미지 원래대로 어케바꿈?
*/
    }
    fun doAction5(view: View) {
        Toast.makeText(view.context, "자 드가자", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, AgodaLogin::class.java)
        startActivity(intent)
    }

}
