package net.flow9.thisiskotlin.uibasic

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import net.flow9.thisiskotlin.mbtitest.ViewPagerAdapter

class AgodaNavHome : Fragment() {

    private lateinit var viewPager2: ViewPager2
    private lateinit var pagerAdapter: ViewPagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.activity_agoda_nav_home, container, false)


        viewPager2 = view.findViewById(R.id.mainViewPager)
        pagerAdapter = ViewPagerAdapter(this)
        viewPager2.adapter = pagerAdapter

        return view
    }
}

