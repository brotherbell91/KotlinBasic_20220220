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
//            toast라고 적고 Create a new toast 선택
            Toast.makeText(this,"토스트 버튼 눌림",Toast.LENGTH_SHORT).show()
        }

        btnVariablePractice.setOnClickListener {

//            var/val 에 대한 연습 / 체험

            var myName : String //내용 변경 가능

            val friendName : String //한번 대입한 값으로 고정

//            myName - 내 이름, friendName - 친구 이름

            myName = "이형종"

            friendName = "조경진"

//            내이름 / 친구이름 다시 대입 (데이터 변경)

            myName = "이종형" // 추가로 다시 대입해도 됨. var
//            friendName = "조상민" //한번 넣은 값 계속 사용. val

            Toast.makeText(this, friendName, Toast.LENGTH_SHORT).show()

        }

        btnConditionPractice.setOnClickListener {

            val UserAge = 8

            if(UserAge >= 20){

//                UserAge의 값이 20 이상이면 실행됨.
                Toast.makeText(this, "성인입니다.", Toast.LENGTH_SHORT).show()

            }
            else if(UserAge >= 17){
//                위의 질문이 틀렸을떄의 보완 질문 추가. => 고등학생인가?
                Toast.makeText(this, "고등학생입니다.", Toast.LENGTH_SHORT).show()
            }
            else if (UserAge >= 14){
                Toast.makeText(this, "중학생입니다.", Toast.LENGTH_SHORT).show()
            }
            else{
//                위의 질문이 모두 틀렸을 때 대응할 코드 추가

                Toast.makeText(this, "초등학생 혹은 그 이하입니다.", Toast.LENGTH_SHORT).show()
            }
        }

        btnConditionPractice2.setOnClickListener {

            val salary = 4000
            val minutes = 50
            val overWork = false

//            기준 1. 연봉이 5천 이상이면 OK.
            if(salary >= 5000){
                Toast.makeText(this, "연봉이 5천이상", Toast.LENGTH_SHORT).show()
            }
//            기준 2. 야근만 안하면 OK.
            if (!overWork){ //overWORK 변수에, true가 있을때만 실행. => NOT부정 : 야근을 하지 않으면.
                Toast.makeText(this, "야근을 안함", Toast.LENGTH_SHORT).show()
            }
//            기준 3. 연봉 4000이상, 거리 30분 이내
            if(salary >= 4000 && minutes < 30) {
                Toast.makeText(this, "연봉 AND 출퇴근시간 OK", Toast.LENGTH_SHORT).show()
            }
//            기분 4. 연봉 5000이상 OR 거리 1시간 이내
            if(salary >= 5000 || minutes < 60) {
                Toast.makeText(this, "연봉 OR 출퇴근시간 OK", Toast.LENGTH_SHORT).show()
            }

        }

        btnCalculateAge.setOnClickListener {

//            1. edtBirthYear에 입력된 값(text)을 받아오기 => 변수에 저장해두기.

            val inputBirthYear = edtBirthYear.text.toString()

            Log.d("입력된 년도", inputBirthYear)
        }
    }
}