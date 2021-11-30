package com.team10.android.gainz

import android.app.Application
import com.team10.android.gainz.networking.workout.WorkoutClient
import com.team10.android.gainz.networking.workout.WorkoutService

class MyApplication: Application() {
  lateinit var workoutService: WorkoutService
  override fun onCreate() {
    super.onCreate()
    workoutService = WorkoutClient.getClient()
  }
}