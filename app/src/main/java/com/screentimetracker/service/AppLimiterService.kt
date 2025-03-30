package com.screentimetracker.service

import android.app.Service
import android.content.Intent
import android.os.IBinder

class AppLimiterService : Service() {
    override fun onBind(intent: Intent?): IBinder? = null

    fun lockApp(packageName: String) {
        // Implementation to block app access
    }
}
