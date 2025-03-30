package com.screentimetracker.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "app_limits")
data class AppLimit(
    @PrimaryKey val packageName: String,
    val dailyLimit: Long // in milliseconds
)
