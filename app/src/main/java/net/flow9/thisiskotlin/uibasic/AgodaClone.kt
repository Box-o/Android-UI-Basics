package net.flow9.thisiskotlin.uibasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import net.flow9.thisiskotlin.mbtitest.ViewPagerAdapter

import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView



class AgodaClone : AppCompatActivity() {

//    private lateinit var viewPager2: ViewPager2
    //추가
    private lateinit var bottomNavigationView: BottomNavigationView
    //추가

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agoda_clone)

//        viewPager2 = findViewById(R.id.mainViewPager)
//        val pagerAdapter = ViewPagerAdapter(this)
//        viewPager2.adapter = pagerAdapter


        //추가~~
        bottomNavigationView = findViewById(R.id.bottomNavigationView)

        replaceFragment(AgodaNavHome())

        bottomNavigationView.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.menu_item1 -> replaceFragment(AgodaNavHome())
                R.id.menu_item2 -> replaceFragment(AgodaNavTrip())
                R.id.menu_item3 -> replaceFragment(AgodaNavDeals())
                R.id.menu_item4 -> replaceFragment(AgodaNavCart())
                R.id.menu_item5 -> replaceFragment(AgodaNavMore())
            }
            true
        }
    }
    //추가

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.toptoptop, fragment)
            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            .commit()


//        supportFragmentManager.beginTransaction()
//            .replace(R.id.topscrollview, fragment)
//            .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
//            .commit()
    }

    //추가

//https://velog.io/@boiledegg/Fragment



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
    fun startAgoji(view: View) {
        val intent = Intent(this, AgodaAgoji::class.java)
        startActivity(intent)
    }

}
