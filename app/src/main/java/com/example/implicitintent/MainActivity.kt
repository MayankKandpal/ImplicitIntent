package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mailBtn.setOnClickListener {
            val email = etVar1.text.toString()
            val i = Intent()
            i.action = Intent.ACTION_SENDTO
            i.data = Uri.parse("mailto:$email")
            startActivity(i)

        }
        dialBtn.setOnClickListener{
            val dial = etVar1.text.toString()
            val i = Intent()
            i.action = Intent.ACTION_DIAL
            i.data = Uri.parse("tel:$dial")
            startActivity(i)
        }
        brwBtn.setOnClickListener{
            val brw = etVar1.text.toString()
            val i = Intent()
            i.action = Intent.ACTION_VIEW
            i.data = Uri.parse("http://$brw")
            startActivity(i)
        }


    }


}
