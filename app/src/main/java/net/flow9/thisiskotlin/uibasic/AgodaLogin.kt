package net.flow9.thisiskotlin.uibasic

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class AgodaLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agoda_login)
    }
    fun doAction5_1(view: View) {
        Toast.makeText(view.context, "아이디를 만들어 볼까??", Toast.LENGTH_SHORT).show()

        val intent = Intent(this, AgodaCreateAccount::class.java)
        startActivity(intent)
    }
}