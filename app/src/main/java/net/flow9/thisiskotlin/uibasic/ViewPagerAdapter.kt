package net.flow9.thisiskotlin.mbtitest

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import net.flow9.thisiskotlin.uibasic.AgodaNavHome
import net.flow9.thisiskotlin.uibasic.ScreenSlidePageFragment
import net.flow9.thisiskotlin.uibasic.R


class ViewPagerAdapter(fragmentActivity: AgodaNavHome) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 2
        //return에 질문지의 개수를 입력한다 = 넘김 페이지 개수
    }


/*

    override fun createFragment(position: Int): Fragment {
        return ScreenSlidePageFragment()
    }
}
*/
    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ScreenSlidePageFragment.newInstance(R.layout.agoda_fragment_1)
            1 -> ScreenSlidePageFragment.newInstance(R.layout.agoda_fragment_2)
            else -> throw IllegalArgumentException("Invalid position")
        }
    }
}