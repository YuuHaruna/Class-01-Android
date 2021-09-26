package com.example.class01android

import java.util.*

class Person(var firstName: String, var lastName: String, var birthYear: Int) {
    val cal: Calendar = Calendar.getInstance()
    val fullName: String
        get() {
            return "$firstName $lastName"
        }
    val age: Int
        get() {
            return cal.get(Calendar.YEAR) - birthYear
        }
}