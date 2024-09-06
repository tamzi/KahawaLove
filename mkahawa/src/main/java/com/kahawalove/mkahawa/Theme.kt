package com.kahawalove.mkahawa


import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.kahawalove.mkahawa.atoms.color.*
import com.kahawalove.mkahawa.atoms.type.Typography


@Composable
fun MkahawaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    shadesOfFallTheme: Boolean = true,
    shadesOfNitroTheme: Boolean = false,
    shadesOfSpringTheme: Boolean = false,
    shadesOfSummerTheme: Boolean = false,
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkDefaultColorScheme
        shadesOfFallTheme -> ShadesOfFallColorScheme
        shadesOfNitroTheme -> ShadesOfNitroColorScheme
        shadesOfSpringTheme -> ShadesOfSpringColorScheme
        shadesOfSummerTheme -> ShadesOfSummerColorScheme
        else -> LightDefaultColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}