package com.kahawalove.mkahawa.utils.datastore

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore

// DataStore
val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = "settings")

// DataStore Keys
object PreferencesKeys {
    val CURRENT_SEASON = stringPreferencesKey("current_season")
}