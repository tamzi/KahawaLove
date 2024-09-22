package com.kahawalove.mkahawa.atoms.color

import androidx.annotation.VisibleForTesting
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme

// Thinking....
// create the app colour scheme and not depend on material theme??
// Foundation would make sense to depend on material theme but not the app colour scheme
// drop `lightColorScheme` and `darkColorScheme` and use `SPECColorScheme` instead, where SPEC is Spring, Summer, Nitro, Fall?
// Use WorkManger to guarantee the app colour scheme is always available even if the app is in background.


/**
 * The default color theme for the app.
 * This is used to create the [LightDefaultColorScheme] which acts as the default color scheme for the light theme.
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
 * Dark theme color scheme.
 * We use the above light theme color scheme to create the dark theme color scheme.
 * This is used to create the [DarkDefaultColorScheme].
 *
 * 1.`Primary`: KLAccentGreen
 *  - In a dark theme, a slightly brighter green like KLAccentGreen becomes the
 *  primary color to maintain brand identity while standing out against darker backgrounds.
 *
 * 2.`onPrimary`: KLWhite
 *  - White text and icons will maintain contrast on the primary green,
 *  ensuring readability against the deep accent green.
 *
 * 3.`PrimaryContainer`: KLHouseGreen
 *  - A darker green variant used for primary containers in the dark theme,
 *      providing a softer but still brand-consistent background for primary UI elements.
 *
 * 4.`onPrimaryContainer`: KLWarmNeutral
 *  - The warm neutral color provides a subtle contrast against the deep green,
 *  making text or icons easy to read on primary containers.
 *
 * 5.`Secondary`: KLLightGreen
 *  - For secondary elements, the light green brings balance and a touch of
 *  brightness to the dark theme, acting as an accent color.
 *
 * 6.`onSecondary`: KLBlack
 *  - Black text or icons on light green elements ensure clear readability,
 *  offering good contrast against the light secondary color.
 *
 * 7.`SecondaryContainer`: KLGreen
 *  - In the dark theme, using a deeper green like KLGreen for secondary containers provides
 *  depth and richness without overpowering the interface.
 *
 * 8.`onSecondaryContainer`: KLCoolNeutral
 *  - Light cool neutral text or icons contrast well with the deeper green,
 *  ensuring readability on secondary containers.
 *
 * 9.`Tertiary`: KLLightBlack
 * This muted black tone works well as a tertiary color, providing a neutral accent that
 * adds depth to the interface.
 *
 * 10.`onTertiary`: KLWhite
 *  - White text ensures visibility and legibility when placed on the darker tertiary elements,
 *  maintaining good contrast.
 *
 * 11.`TertiaryContainer`: KLAccentGreen
 *  - The brighter accent green serves as a tertiary container background,
 *  bringing some vibrancy to darker sections of the UI.
 *
 * 12.`onTertiaryContainer`: KLWhite
 *  - White text or icons ensure legibility on the vibrant tertiary container, maintaining clarity and focus.
 *
 * 13.`Error`: KLBrightRed
 *  - Error messages in dark mode remain consistent with bright red, standing out against
 *  the dark background while signaling attention.
 *
 * 14.`onError`: KLWhite
 *  - White text ensures readability when placed over error states, providing the necessary
 *  contrast against the bright red.
 *
 * 15.`ErrorContainer`: KLDarkRed
 *  - A darker red can be used for error containers in the dark theme, blending better with the dark surroundings while still signaling an error state.
 *
 * 16.`onErrorContainer`: KLLightRed
 *  - A lighter red on darker error containers ensures text or icon readability in error-related areas.
 *
 * 17.`Background`: KLBlack
 *  - Black is the ideal background for dark themes, providing a deep, neutral base for
 *  other elements to stand out.
 *
 * 18.`onBackground`: KLWarmNeutral
 *  - Warm neutral text or icons create a softer contrast against the black background,
 *  ensuring readability while maintaining a welcoming tone.
 *
 * 19.`Surface`: KLLightBlack
 *  - This lighter black tone serves as a surface color, creating subtle layers and depth without
 *  making the UI too stark.
 *
 * 20.`onSurface`: KLWhite
 *  - White text or icons on dark surface elements ensure maximum legibility and clarity,
 *  providing necessary contrast in a dark theme.
 *
 * 21.`SurfaceVariant`: KLGreen
 *  - For surface variants, the primary green works well to provide additional color depth and
 *  maintain brand recognition.
 *
 * 22.`onSurfaceVariant`: KLCoolNeutral
 *  - The cool neutral color contrasts with the green surface variant,
 *  offering clarity while maintaining the theme's dark aesthetic.
 *
 * 23.`InverseSurface`: KLCoolNeutral
 *  - In dark mode, using a lighter neutral for inverse surfaces provides contrast with
 *  the predominantly dark background, making elements like cards or dialogs stand out.
 *
 * 24.`InverseOnSurface`: KLBlack
 *  - Black text or icons on lighter inverse surfaces ensures legibility while maintaining
 *  the overall feel of the dark theme.
 *
 * 25.`Outline`: KLGreen
 *  - Outlines in a deep green will maintain subtle structure while adding a touch of color
 *  to the dark theme, keeping it in line with the brand aesthetic.
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







