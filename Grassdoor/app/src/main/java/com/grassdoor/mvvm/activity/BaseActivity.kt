package com.grassdoor.mvvm.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.grassdoor.mvvm.R

 class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)
    }
}