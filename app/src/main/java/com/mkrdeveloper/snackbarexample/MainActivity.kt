package com.mkrdeveloper.snackbarexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainLayout = findViewById<LinearLayout>(R.id.manLayout)
        val btn1 = findViewById<Button>(R.id.btn1)
        val btn2 = findViewById<Button>(R.id.btn2)
        val btn3 = findViewById<Button>(R.id.btn3)

        btn1.setOnClickListener {
            Snackbar.make(mainLayout,"simple snackbar", Snackbar.LENGTH_SHORT).show()
        }
        btn2.setOnClickListener {
            Snackbar.make(mainLayout,"snackbar with action", Snackbar.LENGTH_SHORT)
                .setAction("Toast"){
                    Toast.makeText(this,"mkr developer", Toast.LENGTH_SHORT).show()
                }
                .show()
        }
        btn3.setOnClickListener {
            Snackbar.make(mainLayout,"constant snackbar ", Snackbar.LENGTH_INDEFINITE)
                .setAction("Toast"){
                    Toast.makeText(this,"mkr developer", Toast.LENGTH_SHORT).show()
                }
                .show()
        }





    }
}