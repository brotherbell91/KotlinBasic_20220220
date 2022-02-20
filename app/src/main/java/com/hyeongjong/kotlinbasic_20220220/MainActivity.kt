package com.hyeongjong.kotlinbasic_20220220

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        ctrl + / => 현재 줄을 주석으로

//        btnLog 버튼이 눌리면 해야할 일을 지정.

        btnLog.setOnClickListener {

//            로그 버튼이 눌릴때마다 실행될 코드 { }

//            로그를 찍어보자
            Log.d("메인화면", "로그 버튼 눌림")

        }
    }
}