package com.songyooho.lockscreentest

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.Settings
import android.util.Log
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("체크","onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setShowWhenLocked(true)
        window.addFlags(WindowManager.LayoutParams.FLAG_SHOW_WHEN_LOCKED or WindowManager.LayoutParams.FLAG_DISMISS_KEYGUARD)
        startForegroundService(Intent(this, MyService::class.java))

        if (!Settings.canDrawOverlays(this)) {
            val intent = Intent(
                Settings.ACTION_MANAGE_OVERLAY_PERMISSION,
                Uri.parse("package:$packageName")
            )
            startActivity(intent)
        }
    }

    override fun onResume() {
        Log.d("체크","onResume")
        super.onResume()
    }

    override fun onStop() {
        Log.d("체크","onStop")
        super.onStop()
    }

    override fun onPause() {
        Log.d("체크","onPause")
        super.onPause()
    }

    override fun onDestroy() {
        Log.d("체크","onDestroy")
        super.onDestroy()
    }
}