package com.example.lesson15

import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {

    protected fun goToWeb(websiteName: String){
        startActivity(Intent(Intent.ACTION_VIEW, Uri.parse("http://$websiteName")))
        Toast.makeText(this,"Вы открыли браузер", Toast.LENGTH_LONG).show()
    }

    protected fun goToPhone(phoneNumber:String){
        startActivity(Intent(Intent.ACTION_DIAL,Uri.parse("tel:$phoneNumber")))
        Toast.makeText(this,"Вы открыли набор номера", Toast.LENGTH_LONG).show()
    }
}