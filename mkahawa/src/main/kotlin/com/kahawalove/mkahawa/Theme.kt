package com.kahawalove.mkahawa


import android.content.Context
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import com.kahawalove.mkahawa.atoms.color.*
import com.kahawalove.mkahawa.atoms.color.shades.ShadesOfFallColorScheme
import com.kahawalove.mkahawa.atoms.color.shades.ShadesOfNitroColorScheme
import com.kahawalove.mkahawa.atoms.color.shades.ShadesOfSpringColorScheme
import com.kahawalove.mkahawa.atoms.color.shades.ShadesOfSummerColorScheme
import com.kahawalove.mkahawa.atoms.type.Typography


@Composable
fun MkahawaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val context = LocalContext.current
    val sharedPreferences = context.getSharedPreferences("theme_prefs", Context.MODE_PRIVATE)
    val currentSeason = remember { sharedPreferences.getString("current_season", "Fall") }

    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkDefaultColorScheme
        currentSeason == "Fall" -> ShadesOfFallColorScheme
        currentSeason == "Winter" -> ShadesOfNitroColorScheme // Assuming Nitro is for Winter
        currentSeason == "Spring" -> ShadesOfSpringColorScheme
        currentSeason == "Summer" -> ShadesOfSummerColorScheme
        else -> LightDefaultColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}