package jp.techacademy.sachiko.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val num1 = 100
        val num2 = 0
        var ans = 0
        ans = num1 / num2

        try {
            ans = num1 / num2

        } catch (e:Exception) {


        } finally     {
        }
    }
}
