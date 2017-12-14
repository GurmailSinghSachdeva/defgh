package com.example.a1wew4g3.defgh.activity

import android.graphics.drawable.ColorDrawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import com.example.a1wew4g3.defgh.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        window.addFlags(WindowManager.LayoutParams.FLAG_BLUR_BEHIND)

//        window.setBackgroundDrawable(ColorDrawable(0x7f000000))
//        getWindow().setBackground(new ColorDrawable(0x7f000000)
//        window.addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND)
//        window.setDimAmount(0.5f)
        setContentView(R.layout.activity_main)
    }
}
