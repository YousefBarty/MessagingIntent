package com.example.whatsappsms

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val whatsappactivity=findViewById<Button>(R.id.whatsappBtn)
        val smsActivity=findViewById<Button>(R.id.smsBtn)
        val emailActivity=findViewById<Button>(R.id.emsilBtn)
        val webactivity=findViewById<Button>(R.id.webBtn)

        whatsappactivity.setOnClickListener {

            var whatsIntent=Intent(this,SendWhatsAppMessage::class.java)
            startActivity(whatsIntent)

        }

        smsActivity.setOnClickListener {

            var smsIntent=Intent(this,SendSMSActivity::class.java)
            startActivity(smsIntent)

        }

        emailActivity.setOnClickListener {

            var emailIntent=Intent(this,activity_send_mail_acivity::class.java)
            startActivity(emailIntent)

        }


        webactivity.setOnClickListener {

            var webIntent=Intent(this,OpenWebBrowser::class.java)
            startActivity(webIntent)

        }

    }
}