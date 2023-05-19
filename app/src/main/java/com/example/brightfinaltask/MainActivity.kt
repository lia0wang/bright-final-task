package com.example.brightfinaltask

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val linkedinButton: ImageButton = findViewById(R.id.linkedinButton)
        linkedinButton.setOnClickListener {
            val linkedinProfileUrl = "https://www.linkedin.com/in/wangliao-au"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(linkedinProfileUrl))
            startActivity(intent)
        }
    }
}
