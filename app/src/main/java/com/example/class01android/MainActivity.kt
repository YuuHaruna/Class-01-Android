package com.example.class01android

import android.os.Bundle
import android.util.TypedValue
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstNameEditText: EditText = findViewById(R.id.edittext_mainactivity_firstname)
        val firstName = firstNameEditText.text
        val lastNameEditText: EditText = findViewById(R.id.edittext_mainactivity_lastname)
        val lastName = lastNameEditText.text
        val birthYearEditText: EditText = findViewById(R.id.edittext_mainactivity_birthyear)
        val birthYear = birthYearEditText.text
        val confirmButton: Button = findViewById(R.id.button_mainactivity_confirm)
        confirmButton.setOnClickListener {
            val activityNameText: TextView = findViewById(R.id.textview_mainactivity_activityname)
            when {
                firstName.isNotEmpty() && lastName.isNotEmpty() && birthYear.isNotEmpty() -> {
                    activityNameText.setTextSize(TypedValue.COMPLEX_UNIT_SP, 23f)
                    activityNameText.text = "Chúc mừng bạn đã lộ thông tin cá nhân"
                    firstNameEditText.visibility = View.GONE
                    lastNameEditText.visibility = View.GONE
                    birthYearEditText.visibility = View.GONE
                    confirmButton.visibility = View.GONE
                    val person = Person(firstName.toString(),
                        lastName.toString(),
                        birthYear.toString().toInt())
                    val fullName: TextView = findViewById(R.id.textview_mainactivity_fullname)
                    fullName.text = person.fullName
                    fullName.visibility = View.VISIBLE
                    val age: TextView = findViewById(R.id.textview_mainactivity_age)
                    age.text = person.age.toString()
                    age.visibility = View.VISIBLE
                    val job: TextView = findViewById(R.id.textview_mainactivity_job)
                    job.text = when {
                        person.age < 18 -> "Học sinh"
                        person.age > 25 -> "Đi làm"
                        else -> "Sinh viên"
                    }
                    job.visibility = View.VISIBLE
                }
                firstName.isEmpty() && lastName.isEmpty() && birthYear.isEmpty() -> activityNameText.text =
                    "Chưa nhập gì cả"
                else -> activityNameText.text = "Nhập thiếu gòy"
            }
        }
    }
}