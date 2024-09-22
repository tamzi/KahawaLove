package com.kahawalove.mkahawa.utils.workers

import android.content.Context
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import java.util.concurrent.TimeUnit

object SeasonWorkerScheduler {
    fun scheduleSeasonWorker(context: Context) {
        val workRequest = PeriodicWorkRequestBuilder<SeasonWorker>(1, TimeUnit.DAYS).build()
        WorkManager.getInstance(context).enqueue(workRequest)
    }
}