@file:Suppress("DEPRECATION")

package com.example.epfcalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonPickDate.setOnClickListener{
            val dateFragment = DatePickerFragment()
            dateFragment.show(fragmentManager, "Date Picker")
        }
    }
}
