package org.geeksforgeeks.audiomanagerring

import android.content.Context
import android.media.AudioManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mButton = findViewById<Button>(R.id.btn1)
        val mAudioManager = getSystemService(Context.AUDIO_SERVICE) as AudioManager

        mButton.setOnClickListener {
            when(Objects.requireNonNull(mAudioManager).ringerMode){
                AudioManager.RINGER_MODE_NORMAL -> Toast.makeText(applicationContext, "Normal", Toast.LENGTH_SHORT).show()
                AudioManager.RINGER_MODE_SILENT -> Toast.makeText(applicationContext, "Silent", Toast.LENGTH_SHORT).show()
                AudioManager.RINGER_MODE_VIBRATE -> Toast.makeText(applicationContext, "Vibrate", Toast.LENGTH_SHORT).show()
            }
        }
    }
}