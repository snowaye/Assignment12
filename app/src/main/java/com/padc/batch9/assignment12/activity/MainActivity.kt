package com.padc.batch9.assignment12.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.padc.batch9.assignment12.R
import com.padc.batch9.assignment12.util.Utils

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Utils.setStatusBarColor(this, R.color.textColorPrimaryLight)
    }
}
