package jp.co.stah.hondana

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.EditText
import java.io.FileOutputStream

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val filesDirectoryPath = this.filesDir.path
//=> /data/data/[package name]/files
   //     val file = File(absolutePath)
        val fileContents = "Hello world!"

        val fo = FileOutputStream(this.filesDir.path + "/test/" + "fileName")
        this.openFileOutput("test.txt", Context.MODE_PRIVATE).use {
            it.write(fileContents.toByteArray())
        }

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val title = findViewById<EditText>(R.id.titleEdit)
            val author = findViewById<EditText>(R.id.authorEdit)

            Log.d("TAG", title.text.toString())
            Log.d("TAG", author.text.toString())
        }


    }
}
