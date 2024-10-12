package com.kahawalove.mkahawa.atoms.color.shades

import androidx.annotation.VisibleForTesting
import androidx.compose.material3.lightColorScheme
import com.kahawalove.mkahawa.atoms.color.KLBrightGreen
import com.kahawalove.mkahawa.atoms.color.KLGreen
import com.kahawalove.mkahawa.atoms.color.KLHouseGreen
import com.kahawalove.mkahawa.atoms.color.KLLightGreen
import com.kahawalove.mkahawa.atoms.color.KLLightOrange
import com.kahawalove.mkahawa.atoms.color.KLPeach
import com.kahawalove.mkahawa.atoms.color.KLSoftPink
import com.kahawalove.mkahawa.atoms.color.KLSummerMauve
import com.kahawalove.mkahawa.atoms.color.KLSummerYellow
import com.kahawalove.mkahawa.atoms.color.KLVibrantOrange
import com.kahawalove.mkahawa.atoms.color.KLWhite

/**
 * Color scheme for the Summer season
 * Shades of Summer scheme has a base of already existing from
 * [KLColor](KLColor.kt) and constitutes of the following colors:
 *
 * - KLGreen
 * - KLHouseGreen
 * - KLLightGreen
 * - KLSummerMauve
 * - KLPeach
 * - KLLightOrange
 * - KLSummerYellow
 * - KLSoftPink
 * - KLBrightGreen
 * - KLVibrantOrange
 *
 *
 * `Primary`: KLGreen
 *    - The core primary color remains KLGreen.
 *    It represents lush, verdant life, grounding the summer theme in nature and providing a rich contrast to the brighter summer tones.
 *
 * `onPrimary`: KLLightGreen
 *    - A soft, light green complements KLGreen perfectly and ensures high readability,
 *    -It keeps a clean, refreshing feel for text or icons on primary elements.
 *
 * `PrimaryContainer`: KLBrightGreen
 *    - A vibrant green brings an energized, summery feel to containers or components, signaling activity and growth.
 *
 * `onPrimaryContainer`: KLSoftPink
 *    - Soft pink provides a subtle contrast to the bright green container,
 *    adding a touch of warmth without overpowering the vibrant green.
 *
 * `Secondary`: KLSummerMauve
 *    - This beautiful mauve color brings in a playful, feminine element to the palette,
 *    - perfect for secondary components like action buttons or highlighted areas.
 *
 * `onSecondary`: KLHouseGreen
 *    - The darker house green contrasts well with the vibrant mauve,
 *    creating an appealing combination for legible text or icons on secondary components.
 *
 * `SecondaryContainer`: KLPeach
 *    - This soft, warm peach tone serves as a secondary container background,
 *    - offering a gentle, summery vibe that feels light and approachable.
 *
 * `onSecondaryContainer`: KLBrightGreen
 *    - The vibrant green pops against the peach,
 *    adding a bright contrast while maintaining a summery, lively feel.
 *
 * `Tertiary`: KLSummerYellow
 *    - A cheerful yellow serves as the tertiary color,
 *    bringing brightness and optimism to elements like highlights, badges, or accents.
 *
 * `onTertiary`: KLHouseGreen
 *    - The dark green contrasts well with the light yellow,
 *    ensuring good legibility while retaining a natural connection within the palette.
 *
 * `TertiaryContainer`: KLSoftPink
 *    - This soft pink adds a light, breezy feeling to the tertiary container,
 *    perfect for soft background elements or notifications that blend into the warm summer theme.
 *
 * `onTertiaryContainer`: KLHouseGreen
 *    - Text or icons on soft pink backgrounds will use the house green
 *    for strong contrast and readability, keeping the design grounded.
 *
 * `Error`: KLVibrantOrange
 *    - A bright, warm orange brings in a sense of urgency for error states
 *    while maintaining the summery, vibrant feel. It stands out without feeling harsh.
 *
 * `onError`: KLWhite
 *    - White provides clean, high contrast for text or icons on top of the vibrant orange,
 *    ensuring error messages are clearly visible.
 *
 * `ErrorContainer`: KLLightOrange
 *    - A softer orange for error containers maintains warmth but with less intensity,
 *    signaling errors without overwhelming the interface.
 *
 * `onErrorContainer`: KLVibrantOrange
 *    - A slightly darker orange is used for text or icons on the light orange container,
 *    maintaining harmony with the error palette.
 *
 * `Background`: KLPeach
 *    - This warm, soft peach serves as the background color,
 *    giving the interface an inviting, warm tone that feels light and fresh.
 *
 * `onBackground`: KLHouseGreen
 *    - The dark green stands out well on the peach background, providing clarity
 *    and a strong contrast while maintaining the earthy tones of the palette.
 *
 * `Surface`: KLSoftPink
 *    - A light pink surface color adds a soft, summery texture to elements like cards,
 *    modals, or sheets, enhancing the warmth and vibrancy of the design.
 *
 * `onSurface`: KLGreen
 *    - Text or icons on soft pink surfaces will use the primary green to provide a harmonious,
 *    natural contrast, keeping the interface readable.
 *
 * `SurfaceVariant`: KLLightGreen
 *    - This light green works well as a surface variant,
 *    giving depth to layered elements while maintaining a soft, fresh look in the summer theme.
 *
 * `onSurfaceVariant`: KLHouseGreen
 *    - The darker green contrasts well with the light green variant,
 *    ensuring readability for text and icons on lighter surfaces.
 *
 * `InverseSurface`: KLVibrantOrange
 *    - For inverse surfaces, the vibrant orange adds a burst of color while keeping the design warm and lively.
 *
 * `InverseOnSurface`: KLWhite
 *    - White text or icons on vibrant orange inverse surfaces will create
 *    the necessary contrast and readability, ensuring clear visual hierarchy.
 *
 * `Outline`: KLSummerYellow
 *    - This cheerful yellow serves as a subtle outline color,
 *    adding definition to components while maintaining a light, summer vibe.
 *
 */


val ShadesOfSummerColorScheme = lightColorScheme(
    primary = KLGreen,
    onPrimary = KLLightGreen,
    primaryContainer = KLBrightGreen,
    onPrimaryContainer = KLSoftPink,
    secondary = KLSummerMauve,
    onSecondary = KLHouseGreen,
    secondaryContainer = KLPeach,
    onSecondaryContainer = KLBrightGreen,
    tertiary = KLSummerYellow,
    onTertiary = KLHouseGreen,
    tertiaryContainer = KLSoftPink,
    onTertiaryContainer = KLHouseGreen,
    error = KLVibrantOrange,
    onError = KLWhite,
    errorContainer = KLLightOrange,
    onErrorContainer = KLVibrantOrange,
    background = KLPeach,
    onBackground = KLHouseGreen,
    surface = KLSoftPink,
    onSurface = KLGreen,
    surfaceVariant = KLLightGreen,
    onSurfaceVariant = KLHouseGreen,
    inverseSurface = KLVibrantOrange,
    inverseOnSurface = KLWhite,
    outline = KLSummerYellow,
)


// Add the corresponding dark theme...TBD
