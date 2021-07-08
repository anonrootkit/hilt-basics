package com.example.hilt.activity.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hilt.R
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

//    @Inject
//    lateinit var human : Human

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        human.printGenders()
    }
}

//class Human @Inject constructor(
//    private val male : Male,
//    private val female: Female
//){
//    fun printGenders() {
//        male.gender()
//        female.gender()
//    }
//}
//
//class Male @Inject constructor() : Gender{
//    override fun gender() {
//        println("I'm a male")
//    }
//}
//
//class Female @Inject constructor() : Gender{
//    override fun gender() {
//        println("I'm a female")
//    }
//
//}
//
//interface Gender{
//    fun gender()
//}