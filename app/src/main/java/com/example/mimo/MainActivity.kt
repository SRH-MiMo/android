package com.example.mimo

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.view.View.OnClickListener
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

            val markImageView: ImageView = findViewById(R.id.mark)

            val homeImageView: ImageView = findViewById(R.id.home)

            val homeImageView.setOnClickListener {
                val intent = Intent(this, NextActivity::class.java)
                startActivity(intent)
            }
        }

        }
}

class NextActivity {

}
