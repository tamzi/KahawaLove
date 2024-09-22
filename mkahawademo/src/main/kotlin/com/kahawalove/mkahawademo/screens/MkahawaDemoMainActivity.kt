package com.kahawalove.mkahawademo.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.kahawalove.mkahawa.utils.workers.SeasonWorkerScheduler
import com.kahawalove.mkahawademo.screens.screens.MkahawaDemoMainScreen

class MkahawaDemoMainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent { MkahawaDemoMainScreen() }

        // Schedules the SeasonWorker
        SeasonWorkerScheduler.scheduleSeasonWorker(this)
    }
}
