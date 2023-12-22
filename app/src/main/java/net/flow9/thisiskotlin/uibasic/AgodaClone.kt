package net.flow9.thisiskotlin.uibasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import android.widget.ImageView
import android.view.MotionEvent
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import net.flow9.thisiskotlin.mbtitest.ViewPagerAdapter


class AgodaClone : AppCompatActivity() {

    private lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agoda_clone)

        viewPager2 = findViewById(R.id.mainViewPager)
        val pagerAdapter = ViewPagerAdapter(this)
        viewPager2.adapter = pagerAdapter






/*
        val hotell : ImageView = findViewById(R.id.iv_hotel)
//        hotell.setOnClickListener {
//            hotell.setImageDrawable(R.drawable.agoda_hotelonclick)
//        }
        hotell.setOnClickListener {
            hotell.setImageResurce(R.drawable.agoda_hotelonclick)
        }
//이미지 누르면 변하기는 하는데 원래대로 어케바꿈?
*/

    }
    fun doAction5(view: View) {
        Toast.makeText(view.context, "자 드가자", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, AgodaLogin::class.java)
        startActivity(intent)
    }

    fun doRecYes(view: View) {
        Toast.makeText(view.context, "조아요! 구독! 알림설정까지!", Toast.LENGTH_SHORT).show()
    }
    fun doRecNo(view: View) {
        Toast.makeText(view.context, "싫어요, 쓰레기임", Toast.LENGTH_SHORT).show()
    }

}
