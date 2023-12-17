package net.flow9.thisiskotlin.uibasic

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SizeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.ui_component_size)

        val myImageView: ImageView = findViewById(R.id.iv_click)

        // 이미지뷰에 클릭 리스너 추가
        myImageView.setOnClickListener {
            // 클릭 이벤트가 발생했을 때 실행될 코드
            showToast("이미지뷰가 클릭되었습니다.")
        }
    }
    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}


//결과적으로 작동은 되나 이해를 하지 못함 -> 해결 EmptyView Activity 생셩시 .kt .xml 자동 연결
