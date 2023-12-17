package net.flow9.thisiskotlin.uibasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class ViewsArrange : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_views_arrange)
        }
    fun doAction3_1(view: View) {
        Toast.makeText(view.context, "자 드가자", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, LinearLayoutActivity::class.java)
        startActivity(intent)
    }
}