package com.example.class01android

class Person(var firstName: String, var lastName: String, var birthYear: Int) {
    val fullName: String
        get() {
            return "$firstName $lastName"
        }
    val age: Int
        get() {
            return 2021 - birthYear
        }
}