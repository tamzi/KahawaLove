package com.kahawalove.mkahawa.utils.workers


import android.content.Context
import androidx.datastore.preferences.core.edit
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.kahawalove.mkahawa.utils.Season
import com.kahawalove.mkahawa.utils.datastore.PreferencesKeys.CURRENT_SEASON
import com.kahawalove.mkahawa.utils.datastore.dataStore

class SeasonWorker(
    context: Context,
    workerParams: WorkerParameters
) : CoroutineWorker(context, workerParams) {

    private val dataStore = context.dataStore

    override suspend fun doWork(): Result {
        return try {
            val currentSeason = Season.getCurrentSeason()
            dataStore.edit { settings ->
                settings[CURRENT_SEASON] = currentSeason.name
            }
            Result.success()
        } catch (e: Exception) {
            Result.failure()
        }
    }
}