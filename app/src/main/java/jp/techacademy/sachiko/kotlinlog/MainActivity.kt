package jp.techacademy.sachiko.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle



class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val taro = Human( "たろう", 25, "水泳")
        taro.say()
        taro.think()
        val sachiko = Human( "さちこ", 30, "プログラミング")
        sachiko.say()
        sachiko.think()

    }

}