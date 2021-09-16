package com.example.class01android

import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val signinButton: Button = findViewById(R.id.button_mainactivity_signin)
        val emailEditText: EditText = findViewById(R.id.edittext_mainactivity_email)
        val emailInput = emailEditText.text
        val passwordEditText: EditText = findViewById(R.id.edittext_mainactivity_password)
        val passwordInput = passwordEditText.text
        val appName: TextView = findViewById(R.id.textview_mainactivity_appname)
        signinButton.setOnClickListener {
            appName.setTextSize(TypedValue.COMPLEX_UNIT_SP, 40f)
            appName.text = when {
                emailInput.isNotEmpty() && passwordInput.isNotEmpty() -> "Đăng nhập thành công"
                emailInput.isEmpty() && passwordInput.isEmpty() -> "Chưa nhập gì cả"
                else -> "Nhập thiếu gòy"
            }
        }
        val signupButton: TextView = findViewById(R.id.clicktext_mainactivity_signup)
        signupButton.setOnClickListener {
            Toast.makeText(this, "Tìm Fb thật mà đăng ký, tôi là pha ke", Toast.LENGTH_LONG).show()
        }
        val helpButton: TextView = findViewById(R.id.clicktext_mainactivity_help)
        helpButton.setOnClickListener {
            Toast.makeText(this,
                "Tôi cũng cần trợ giúp chứ không phải mỗi bạn :)",
                Toast.LENGTH_LONG).show()
        }
    }
}