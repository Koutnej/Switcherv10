package com.example.petrkoutny.switcherv10

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.KeyEvent
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_card.*

class CardActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

        et_address.setOnEditorActionListener(object: TextView.OnEditorActionListener{
            override fun onEditorAction(v: TextView?, actionId: Int, event: KeyEvent?): Boolean {
                if (actionId==EditorInfo.IME_ACTION_DONE){
                    val address = et_address.text
                    return true
                }
                return false
            }
        })
    }



}