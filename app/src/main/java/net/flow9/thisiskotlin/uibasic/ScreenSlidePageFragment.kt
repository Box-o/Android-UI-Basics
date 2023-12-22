package net.flow9.thisiskotlin.uibasic

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class ScreenSlidePageFragment : Fragment() {

    companion object {
        private const val LAYOUT_RES_ID = "layout_res_id"

        fun newInstance(layoutResId: Int): ScreenSlidePageFragment {
            val fragment = ScreenSlidePageFragment()
            val bundle = Bundle()
            bundle.putInt(LAYOUT_RES_ID, layoutResId)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layoutResId = arguments?.getInt(LAYOUT_RES_ID, R.layout.agoda_fragment_1) ?: R.layout.agoda_fragment_1
        return inflater.inflate(layoutResId, container, false)
    }
}
