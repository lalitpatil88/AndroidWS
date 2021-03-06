package com.example.lalit.messageshareapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonShowToast.setOnClickListener {

            Log.i("MainActivity","Button was clicked!")
            Toast.makeText(this,"Button was clicked!",Toast.LENGTH_SHORT).show()
        }

        btnSendMsgToNextAct.setOnClickListener {

            Log.i("MainActivity","Second Button was clicked!")

            val message: String = editTextUserMessage.text.toString()
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)

        }
    }

}
