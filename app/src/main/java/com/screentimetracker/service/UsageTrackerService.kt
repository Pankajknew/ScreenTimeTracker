package com.screentimetracker.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.app.usage.UsageStatsManager
import android.content.Context

class UsageTrackerService : Service() {
    private lateinit var usageStatsManager: UsageStatsManager

    override fun onBind(intent: Intent?): IBinder? = null

    override fun onCreate() {
        super.onCreate()
        usageStatsManager = getSystemService(Context.USAGE_STATS_SERVICE) as UsageStatsManager
        startTracking()
    }

    private fun startTracking() {
        // Implementation from earlier (track app usage every 5 mins)
    }
}
