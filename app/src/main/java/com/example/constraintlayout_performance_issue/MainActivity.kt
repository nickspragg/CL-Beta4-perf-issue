package com.example.constraintlayout_performance_issue

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.sql.Time

class MainActivity : AppCompatActivity() {

    var visibility = false
    var start = 0L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showHide(view: View){
        if(visibility){
            cardView.visibility = View.GONE
            start = System.currentTimeMillis()
            visibility = false
        } else {
            cardView.visibility = View.VISIBLE
            start = System.currentTimeMillis()
            visibility = true
        }
    }
}
