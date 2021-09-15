package com.example.whatsappsms

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class OpenWebBrowser : AppCompatActivity() , View.OnClickListener{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_web_browser)
    }

    override fun onClick(v: View?) {

        intent = Intent(Intent.ACTION_VIEW)
        intent.data= Uri.parse("https://developer.android.com/")
        startActivity(intent)

    }
}