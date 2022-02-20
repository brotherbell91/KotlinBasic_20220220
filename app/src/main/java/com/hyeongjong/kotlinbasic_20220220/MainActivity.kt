package com.hyeongjong.kotlinbasic_20220220

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
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
//            Debug로그
            Log.d("메인화면", "로그 버튼 눌림")
//            에러 상황 확인
            Log.e("메인화면", "e로 로그 찍어보기")
//            참고/정보용 로그 info
            Log.i("메인화면", "i로 로그 찍어보기")
        }

        btnToast.setOnClickListener {

//            토스트를 띄워보자.
            Toast.makeText(this,"토스트 버튼 눌림",Toast.LENGTH_SHORT).show()
        }
    }
}