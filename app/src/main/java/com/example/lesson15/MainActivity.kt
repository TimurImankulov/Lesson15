package com.example.lesson15

import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupListener()
    }

    private fun setupListener() {
        btnWeb.setOnClickListener(this)
        btnPhone.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        val websiteName = etText1.text.toString()
        val phoneNumber = etText2.text.toString()

        when(view?.id){
            R.id.btnWeb -> goToWeb(websiteName)
            R.id.btnPhone -> goToPhone(phoneNumber)
        }
    }
}