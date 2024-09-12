package com.kahawalove.mkahawa.utils.workers


import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import java.time.LocalDate
import java.time.Month

class SeasonWorker(
    context: Context,
    workerParams: WorkerParameters
) : Worker(context, workerParams) {

    override fun doWork(): Result {
        val currentSeason = getCurrentSeason()
        val sharedPreferences = applicationContext.getSharedPreferences("theme_prefs", Context.MODE_PRIVATE)
        sharedPreferences.edit().putString("current_season", currentSeason).apply()
        return Result.success()
    }

    private fun getCurrentSeason(): String {
        val currentMonth = LocalDate.now().month
        return when (currentMonth) {
            Month.DECEMBER, Month.JANUARY, Month.FEBRUARY -> "Winter"
            Month.MARCH, Month.APRIL, Month.MAY -> "Spring"
            Month.JUNE, Month.JULY, Month.AUGUST -> "Summer"
            Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER -> "Fall"
            else -> "Unknown"
        }
    }
}