package com.phis.loginpractice_20200524

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn.setOnClickListener {

            /*
            var inputId:String = "테스트"
            val inputPw:String = "상수테스트"
            
            inputId = "변수값"
            inputPw = "상수값 변경불가" */

            val inputId = idEdt.text.toString()
            val inputPw = pwEdt.text.toString()

            if(inputId == "admin@admin.com" && inputPw == "qwer") {
                Log.d("로그인확인", "관리자입니다.")
            }
            else {
                Log.d("로그인확인", "로그인에 실패했습니다.")
            }


//            Log.d("입력아이디", inputId)
//            Log.d("입력비번", inputPw)

            /*
            if(inputId.equals("admin")) {
                Log.d("입력ID 확인", "admin임")
            }
            else if(inputId.equals("admin@admin.com")) {
                Log.d("입력ID 확인", "관리자이메일임")
            }
            else {
                Log.d("입력ID확인", "틀린 아이디")
            }

            if(inputId == "admin") {
                Log.d("입력ID 확인", "admin임")
            }
            else if(inputId == "admin@admin.com") {
                Log.d("입력ID 확인", "관리자이메일임")
            }
            else {
                Log.d("입력ID확인", "틀린 아이디")
            } */

            /*
            when (inputId) {
                "admin" -> {Log.d("입력ID","관리자")}
                "admin@admin.com" -> {
                    Log.d("입력ID", "관리자이메일")
                }
                else -> {Log.d("입력ID","틀린ID")}
            } */
       

        }
    }
}
