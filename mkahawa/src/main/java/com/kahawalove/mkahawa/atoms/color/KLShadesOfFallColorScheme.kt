package com.kahawalove.mkahawa.atoms.color

import androidx.annotation.VisibleForTesting
import androidx.compose.material3.lightColorScheme

/**
 *
 *  The Fall Color Scheme [ShadesOfFallColorScheme] should be warm, rich, and earthy,
 *  with deep greens, rusty oranges, and mustard yellows balanced by soft neutral pinks.
 *  This palette reflects the beauty of autumn,
 *  creating a cozy, inviting UI design that evokes the essence of the fall season.
 *
 * These colors evoke the richness of autumn leaves, warm spices, and cozy evenings.
 *
 * Shades of Fall scheme we have the following colors:
 *
 * KLGreen,
 * KLHouseGreen,
 * KLLightGreen
 * KLBlack
 * KLRust
 * KLLightRust
 * KLNeutralPink
 * KLAlmostPumpkin
 * KLMustard
 * KLBurgandy
 *
 *
 *
 * `Primary`: KLGreen
 *    - This deep green serves as a grounding primary color,
 *    symbolizing the evergreen foliage that persists through the autumn season.
 *
 * `onPrimary`: KLLightGreen
 *    - The light green works well on the primary green, providing a soft,
 *    fresh contrast that evokes the feeling of early fall when some greenery remains.
 *
 * `PrimaryContainer`: KLMustard
 *    - The warm mustard yellow adds richness and depth to the primary container elements.
 *    It reflects the golden hues of autumn foliage, making the design feel more seasonal.
 *
 * `onPrimaryContainer`: KLBlack
 *    - Black provides strong contrast on mustard yellow containers,
 *    ensuring readability and maintaining a sophisticated, bold look.
 *
 * `Secondary`: KLRust
 *    - A rich rust color is used as the secondary color, representing the
 *    earthy tones of fallen leaves. This is ideal for buttons or links where you
 *    want to introduce warmth and richness.
 *
 * `onSecondary`: KLNeutralPink
 *    - The soft, neutral pink contrasts well with the rusty red, softening the overall
 *    aesthetic while maintaining a warm, autumnal tone.
 *
 * `SecondaryContainer`: KLNeutralPink
 *    - The neutral pink serves as a secondary container background, evoking the warmth and
 *    softness of the fall palette while maintaining a subtle contrast against the bolder tones.
 *
 * `onSecondaryContainer`: KLRust
 *    - Rusty text or icons on neutral pink containers create a cozy, autumnal contrast,
 *    adding warmth without overwhelming the design.
 *
 * `Tertiary`: KLAlmostPumpkin
 *    - The almost-pumpkin orange is the perfect tertiary color,
 *    evoking the warmth of fall harvests, pumpkins, and autumn festivals.
 *    This color can be used for small accents or important highlights.
 *
 * `onTertiary`: KLHouseGreen
 *    - The deep house green contrasts with the bright orange,
 *    ensuring legibility while maintaining a cohesive fall feel.
 *
 * `TertiaryContainer`: KLMustard
 *    - The warm mustard yellow serves as the tertiary container,
 *    adding a golden touch to the design that complements the autumn tones.
 *
 * `onTertiaryContainer`: KLBlack
 *    - Black provides sharp contrast and readability on mustard yellow containers,
 *    keeping the text or icons clear.
 *
 * `Error`: KLAlmostPumpkin
 *    - A bold, almost-pumpkin orange is used for error states,
 *    giving clear attention without feeling out of place in the warm fall color palette.
 *
 * `onError`: KLWhite
 *    - White text or icons on error elements ensures high visibility and legibility,
 *    contrasting against the bold orange error background.
 *
 * `ErrorContainer`: KLLightRust
 *    - A lighter version of the rust color softens the error container,
 *    maintaining the warmth of the color palette without overwhelming the user.
 *
 * `onErrorContainer`: KLRust
 *    - The original rust color works well on light rust backgrounds,
 *    providing enough contrast to keep error messages legible.
 *
 * `Background`: KLNeutralPink
 *    - This warm, soft pink serves as the background color, creating a welcoming,
 *    cozy feel throughout the interface, much like the soft glow of autumn sunlight.
 *
 * `onBackground`: KLHouseGreen
 *    - Dark house green is used for text or icons on the neutral pink background,
 *    providing strong contrast while evoking the richness of fall foliage.
 *
 * `Surface`: KLRust
 *    - Rust is used for surfaces like cards, modals, or sheets,
 *    adding warmth and a sense of depth that reflects the fall season’s richness.
 *
 * `onSurface`: KLBlack
 *    - Black text or icons on rust-colored surfaces provide high contrast and
 *    clear readability, ensuring a grounded look.
 *
 * `SurfaceVariant`: KLMustard
 *    - Mustard serves as the surface variant color, adding a golden touch that complements
 *    the rust and green tones, evoking the colors of autumn leaves.
 *
 * `onSurfaceVariant`: KLBlack
 *    - Black ensures readability on the mustard surfaces, keeping the design strong and legible.
 *
 * `InverseSurface`: KLBurgandy
 *    - The burgundy adds a touch of cool depth as an inverse surface,
 *    creating an unexpected but complementary balance to the warm fall tones.
 *
 * `InverseOnSurface`: KLWhite
 *    - White text or icons on the burgundy background ensures maximum contrast and visibility,
 *    providing a clean, high-contrast effect.
 *
 * `Outline`: KLAlmostPumpkin
 *    - Almost pumpkin is used for outlines, providing structure to components
 *    while maintaining a warm, seasonal touch.
 *
 */


@VisibleForTesting
val ShadesOfFallColorScheme = lightColorScheme(
    primary = KLGreen,
    onPrimary = KLLightGreen,
    primaryContainer = KLMustard,
    onPrimaryContainer = KLBlack,
    secondary = KLRust,
    onSecondary = KLNeutralPink,
    secondaryContainer = KLNeutralPink,
    onSecondaryContainer = KLRust,
    tertiary = KLAlmostPumpkin,
    onTertiary = KLHouseGreen,
    tertiaryContainer = KLMustard,
    onTertiaryContainer = KLBlack,
    error = KLAlmostPumpkin,
    onError = KLWhite,
    errorContainer = KLLightRust,
    onErrorContainer = KLRust,
    background = KLNeutralPink,
    onBackground = KLHouseGreen,
    surface = KLRust,
    onSurface = KLBlack,
    surfaceVariant = KLMustard,
    onSurfaceVariant = KLBlack,
    inverseSurface = KLBurgandy,
    inverseOnSurface = KLWhite,
    outline = KLAlmostPumpkin,
)
