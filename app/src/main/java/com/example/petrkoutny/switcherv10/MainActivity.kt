package com.example.petrkoutny.switcherv10

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }



    fun btn1_OnClick(view:View){
        val intent:Intent=Intent(this, CardActivity::class.java)
        startActivity(intent)
    }
}
