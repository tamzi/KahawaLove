package com.kahawalove.mkahawa.atoms.color

import androidx.annotation.VisibleForTesting
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme

/**
 * Thinking....create the app colour scheme and not depend on material theme??
 *
 * */



/**
 * The default color theme for the app.
 *
 * 1.`Primary`: KLGreen
 * - Serves as the primary color, used for key interface elements like buttons or navigation bars.
 * - It is bold and rich, making it ideal for primary branding elements.
 *
 * 2.`onPrimary`: KLWhite
 * - White provides a sharp contrast against the KLGreen,
 * - Ensures high visibility for text or icons on the primary elements.
 *
 * 3.`PrimaryContainer`: KLAccentGreen
 * - A slightly lighter green, this is used for container elements, like cards or backgrounds, that relate to primary actions but are less dominant.
 * - It provides a subtle background while still retaining the green tone.
 *
 * 4.`onPrimaryContainer`: KLWarmNeutral
 * - The warm neutral tone works well for text or icons on top of the KLAccentGreen,
 * - Provides good contrast while maintaining warmth and readability.
 *
 * 5.`Secondary`: KLLightGreen
 * - A light, fresh green that complements the primary colors,
 * - used for secondary actions or highlights in the interface.
 *
 * 6.`onSecondary`: KLBlack
 * - Black text or icons placed on light green elements ensure clear readability with high contrast.
 *
 * 7.`SecondaryContainer`: KLCoolNeutral
 * - This cool neutral color can be used for secondary container elements,
 * such as background cards or less prominent sections of the UI,
 * giving the interface a clean and subtle look.
 *
 * 8.`onSecondaryContainer`: KLHouseGreen
 * - Text or icons on cool neutral backgrounds should use the house green for balance, adding visual depth and maintaining the green color theme.
 *
 * 9.`Tertiary`: KLHouseGreen
 * - This darker, earthier green can be used as the tertiary color for
 * accents or components that need distinction from primary and secondary elements.
 *
 * 10.`onTertiary`: KLWhite
 * - White ensures legibility when used for text or icons on tertiary elements,
 * - providing the necessary contrast against the dark house green.
 *
 * 11.`TertiaryContainer`: KLWarmNeutral
 * - A warm neutral serves as a subtle background for tertiary containers,
 * helping to soften the look and create a warm and welcoming aesthetic.
 *
 * 12.`onTertiaryContainer`: KLGreen
 * - KLGreen on warm neutral provides a subtle but distinct contrast, ensuring text remains readable while maintaining harmony with the overall palette.
 *
 * 13.`Error`: KLBrickRed
 * - Although not provided, for error states, a bright red hue can be introduced to clearly indicate issues while standing out from the greens.
 *
 * 14.`onError`: KLWhite
 * - White text on the error background will ensure clear visibility of error messages.
 *
 * 15.`ErrorContainer`: KLLightRed
 * - A lighter version of the error red can be used for error containers,
 * creating a gentler appearance for less critical error states.
 *
 * 16.`onErrorContainer`: KLDarkRed
 * - A darker red for text on lighter error containers will keep the color theme
 * consistent while ensuring readability.
 *
 * 17.`Background`: KLCoolNeutral
 * - This light, cool neutral serves as the main background color,
 * providing a clean, fresh backdrop for the entire interface.
 *
 * 18.`onBackground`: KLBlack
 * - Black text on a light neutral background ensures
 * high contrast and clear readability for the majority of the interface's content.
 *
 * 19.`Surface`: KLWarmNeutral
 * - This warm neutral color works well for surfaces like cards, dialogs, and sheets, offering a subtle contrast to the background and creating depth.
 *
 * 20.`onSurface`: KLBlack
 * - Black text or icons on surface elements provide excellent readability,
 * especially when paired with the light, warm neutral background.
 *
 * 21.`SurfaceVariant`: KLLightBlack
 * - A dark surface variant can add depth to the UI,
 * used for elements like headers or bottom bars to create a layered effect.
 *
 * 22.`onSurfaceVariant`: KLWhite
 * - White text or icons on dark surface variants ensure high contrast and legibility,
 * creating a clean and modern look.
 *
 * 23.`InverseSurface`: KLBlack
 * - For dark mode or inverse surfaces, black can be used effectively to create a sleek and modern interface.
 *
 * 24.`InverseOnSurface`: KLWarmNeutral
 * - Warm neutral on inverse surfaces creates balance and a touch of warmth,
 * - ensuring that the interface doesn't feel too cold or harsh.
 *
 * 25.`Outline`: KLLightBlack
 * - This dark shade can be used for outlines,
 * - provides subtle structure and definition without overwhelming the design.
 *
 * */

@VisibleForTesting
val LightDefaultColorScheme = lightColorScheme(
    primary = KLGreen,
    onPrimary = KLWhite,
    primaryContainer = KLAccentGreen,
    onPrimaryContainer = KLWarmNeutral,
    secondary = KLLightGreen,
    onSecondary = KLBlack,
    secondaryContainer = KLCoolNeutral,
    onSecondaryContainer = KLHouseGreen,
    tertiary = KLHouseGreen,
    onTertiary = KLWhite,
    tertiaryContainer = KLWarmNeutral,
    onTertiaryContainer = KLGreen,
    error = KLBrightRed,
    onError = KLWhite,
    errorContainer = KLLightRed,
    onErrorContainer = KLDarkRed,
    background = KLCoolNeutral,
    onBackground = KLBlack,
    surface = KLWarmNeutral,
    onSurface = KLBlack,
    surfaceVariant = KLLightBlack,
    onSurfaceVariant = KLWhite,
    inverseSurface = KLBlack,
    inverseOnSurface = KLWarmNeutral,
    outline = KLLightBlack,
)


/**
 * Dark theme color scheme
 */

@VisibleForTesting
val DarkDefaultColorScheme = darkColorScheme(
    primary = KLGreen,
    onPrimary = KLWhite,
    primaryContainer = KLAccentGreen,
    onPrimaryContainer = KLWarmNeutral,
    secondary = KLLightGreen,
    onSecondary = KLBlack,
    secondaryContainer = KLCoolNeutral,
    onSecondaryContainer = KLHouseGreen,
    tertiary = KLHouseGreen,
    onTertiary = KLWhite,
    tertiaryContainer = KLWarmNeutral,
    onTertiaryContainer = KLGreen,
    error = KLBrightRed,
    onError = KLWhite,
    errorContainer = KLLightRed,
    onErrorContainer = KLDarkRed,
    background = KLCoolNeutral,
    onBackground = KLBlack,
    surface = KLWarmNeutral,
    onSurface = KLBlack,
    surfaceVariant = KLLightBlack,
    onSurfaceVariant = KLWhite,
    inverseSurface = KLBlack,
    inverseOnSurface = KLWarmNeutral,
    outline = KLLightBlack,

)







