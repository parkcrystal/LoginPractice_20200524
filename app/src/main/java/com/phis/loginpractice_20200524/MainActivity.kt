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
            
            inputId = "조경진" 
            inputPw = "상수값 변경불가" */

            val inputId = idEdt.text.toString()
            val inputPw = pwEdt.text.toString()

//            Log.d("입력아이디", inputId)
//            Log.d("입력비번", inputPw)

        }
    }
}
