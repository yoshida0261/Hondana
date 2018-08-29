package jp.co.stah.hondana

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val title = findViewById<EditText>(R.id.titleEdit)
            val author = findViewById<EditText>(R.id.authorEdit)

            Log.d("TAG", title.text.toString())
            Log.d("TAG", author.text.toString())
        }


    }
}
