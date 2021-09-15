package com.example.whatsappsms

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SendSMSActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_send_s_m_s)

        var number = findViewById<EditText>(R.id.edtPhoneNumber)
        var message = findViewById<EditText>(R.id.edtMessage)
        var btnSendEmail = findViewById<Button>(R.id.btnSendEmail)

        btnSendEmail.setOnClickListener {
            sendSMS(number.text.toString(),message.text.toString() )
        }
    }

    fun sendSMS(phonNumber:String, message:String)
    {
        val uri = Uri.parse("smsto:$phonNumber")

        val intent = Intent(Intent.ACTION_SENDTO, uri)

        intent.putExtra("sms_body", message)

        startActivity(intent)

    }
}