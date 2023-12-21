package net.flow9.thisiskotlin.uibasic

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.iterator
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView

class AgodaCloneLinear : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agoda_clone_linear)

        // viewPager = findViewById(R.id.viewPager)
        // viewPager.adapter = ViewPagerAdapter(this)
        // viewPager.isUserInputEnabled = false

        bottomNavigationView = findViewById(R.id.bottomNavigationView)

        // 초기 선택된 아이콘 색상 변경
        updateIconColor(bottomNavigationView.menu.findItem(R.id.menu_item1))

        // BottomNavigationView 아이템을 선택했을 때 호출되는 리스너 설정
        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            // 아이콘 색상 변경
            updateIconColor(menuItem)

            // 각 아이템에 따라 적절한 작업 수행
            when (menuItem.itemId) {
                R.id.menu_item1 -> {
                    // Home 아이템을 선택한 경우
                    // 원하는 작업 수행
                    true
                }
                R.id.menu_item2 -> {
                    // Bookings 아이템을 선택한 경우
                    // 원하는 작업 수행
                    true
                }
                R.id.menu_item3 -> {
                    // Deals 아이템을 선택한 경우
                    // 원하는 작업 수행
                    true
                }
                R.id.menu_item4 -> {
                    // Cart 아이템을 선택한 경우
                    // 원하는 작업 수행
                    true
                }
                R.id.menu_item5 -> {
                    // More 아이템을 선택한 경우
                    // 원하는 작업 수행
                    true
                }
                else -> false
            }
        }
    }

    private fun updateIconColor(menuItem: MenuItem) {
        // 선택된 아이템의 아이콘 색상 변경
        val selectedDrawable = menuItem.icon
        selectedDrawable?.setTint(ContextCompat.getColor(this, R.color.pastelBlue))

        // 나머지 아이템의 아이콘 색상 초기화
        for (item in bottomNavigationView.menu.iterator()) {
            if (item.itemId != menuItem.itemId) {
                item.icon?.setTint(ContextCompat.getColor(this, R.color.pastelGreen))
            }
        }
    }

    fun doAction9(view: View) {
        Toast.makeText(view.context, "자 드가자", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, AgodaLogin::class.java)
        startActivity(intent)
    }
}
