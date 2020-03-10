package com.bugra.mpp401

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bugra.sharedcode.createApplicationScreenMessage
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        activity_main_tv.text = createApplicationScreenMessage()
    }
}
