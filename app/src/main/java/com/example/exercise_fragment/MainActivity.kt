package com.example.exercise_fragment

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

//    lateinit var counterFragment: CounterFragment
//    lateinit var counterShowFragment: CounterShowFragment
//
//    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        counterFragment = fragment as CounterFragment
//        counterShowFragment = fragment2 as CounterShowFragment
//        println("MAIN_ACTIVITY this = $this")
    }
//
//    override fun notifyCounterIncrease(){
//        counter+=1
//        counterShowFragment.notifyCounterChange(counter)
//    }
//
//    override fun notifyCounterDecrease(){
//        counter-=1
//        counterShowFragment.notifyCounterChange(counter)
//    }

    fun toSecondActivity(view: View) {
        startActivity(Intent(this, SecondActivity::class.java))
    }
}