package com.kahawalove.mkahawa.atoms.color

import androidx.annotation.VisibleForTesting
import androidx.compose.material3.lightColorScheme

/**
 * Default color scheme for the Nitro season scheme has a base already existing from
 * [KLColor](KLColor.kt) and constitutes of the following colors:
 *
 * - KLGreen
 * - KLHouseGreen
 * - KLLightGreen
 * - KLBlack
 * - KLBrickRed
 * - KLNitroLightRed
 * - KLNitroGreen
 * - KLNitroCoral
 * - KLBrightPurple
 *
 *
 * `Primary`: KLGreen
 *    - KLGreen serves as the foundational primary color. Its rich, natural tone grounds
 *    the palette and provides a strong contrast to the more vibrant accent colors.
 *
 * `onPrimary`: KLLightGreen
 *    - Light green is used on primary elements to ensure readability and a fresh,
 *    clean contrast against the deep green.
 *
 * `PrimaryContainer`: KLNitroGreen
 *    - The bright nitro green is perfect for primary containers, bringing a sharp,
 *    electric feel to the design. It adds energy and excitement without overwhelming the interface.
 *
 * `onPrimaryContainer`: KLBlack
 *    - Black provides a strong contrast on the bright nitro green, ensuring text and icons are clear and legible.
 *
 * `Secondary`: KLBrickRed
 *    - The vivid brick red serves as the secondary color. It introduces a bold,
 *    warm tone into the scheme and works well for attention-grabbing elements like buttons and links.
 *
 * `onSecondary`: KLHouseGreen
 *    - The dark house green contrasts nicely with the bright brick red, keeping the text
 *    or icons sharp and readable while maintaining a cohesive visual tone.
 *
 * `SecondaryContainer`: KLLightGreen
 *    - A soft light green is used as a secondary container background, providing a calm balance
 *    to the more intense primary and secondary colors.
 *
 * `onSecondaryContainer`: KLBrickRed
 *    - Brick red text or icons on light green surfaces create a striking contrast that is
 *    vibrant yet not overwhelming, maintaining visual hierarchy.
 *
 * `Tertiary`: KLNitroCoral
 *    - Nitro coral introduces a lively, warm tone as the tertiary color, ideal for accent
 *    elements like badges or subtle highlights that need to pop.
 *
 * `onTertiary`: KLBlack
 *    - Black provides clear contrast on the bright nitro coral, ensuring text is legible and strong.
 *
 * `TertiaryContainer`: KLBrightPurple
 *    - The bold, electric purple serves as the tertiary container, adding a splash of
 *    cool vibrancy to the palette. It works well for background elements that need to stand out without dominating.
 *
 * `onTertiaryContainer`: KLBlack
 *    - Black again offers strong contrast against the bright purple, ensuring clarity for any
 *    text or icons placed on this tertiary background.
 *
 * `Error`: KLBrickRed
 *    - For error states, the brick red provides a bold and clear indication of issues.
 *    Its vivid tone grabs attention without feeling harsh.
 *
 * `onError`: KLWhite
 *    - White text on error elements ensures readability and a clean contrast,
 *    helping users easily identify error messages or warnings.
 *
 * `ErrorContainer`: KLNitroLightRed
 *    - A lighter variation of brick red for error containers softens the visual intensity
 *    while still communicating an error state.
 *
 * `onErrorContainer`: KLBrickRed
 *    - The original brick red offers a clear contrast on the lighter error container,
 *    keeping text or icons legible.
 *
 * `Background`: KLBlack
 *    - In the nitro theme, black serves as the background, creating a sleek and modern
 *    look that allows the vibrant colors to pop.
 *
 * `onBackground`: KLLightGreen
 *    - The light green works well on the black background, providing a softer contrast that
 *    remains clear and readable without overwhelming the user.
 *
 * `Surface`: KLHouseGreen
 *    - Dark house green provides depth as a surface color, creating a muted tone that contrasts
 *    against the brighter elements while still feeling cohesive.
 *
 * `onSurface`: KLBrickRed
 *    - The vivid brick red contrasts well on the dark green surface, adding a touch of warmth
 *    and energy to surface elements like cards or modals.
 *
 * `SurfaceVariant`: KLNitroGreen
 *    - Nitro green is used as a surface variant to create an additional layer of dynamism,
 *    providing a high-energy pop to certain areas of the design.
 *
 * `onSurfaceVariant`: KLBlack
 *    - Black provides a strong contrast against the vibrant nitro green surface variant,
 *    ensuring clarity for text or icons.
 *
 * `InverseSurface`: KLBrightPurple
 *    - For inverse surfaces, the bright purple introduces a cool, vibrant feel that contrasts
 *    well against the darker tones of the palette.
 *
 * `InverseOnSurface`: KLWhite
 *    - White text on bright purple surfaces ensures maximum readability, creating a clean,
 *    high-contrast effect.
 *
 * `Outline`: KLBrickRed
 *    - The brick red is used for outlines, providing a bold and striking accent
 *    - Adds structure to components without overpowering them.
 *
 */
@VisibleForTesting
val ShadesOfNitroColorScheme = lightColorScheme(
    primary = KLGreen,
    onPrimary = KLLightGreen,
    primaryContainer = KLNitroGreen,
    onPrimaryContainer = KLBlack,
    secondary = KLBrickRed,
    onSecondary = KLHouseGreen,
    secondaryContainer = KLLightGreen,
    onSecondaryContainer = KLBrickRed,
    tertiary = KLNitroCoral,
    onTertiary = KLBlack,
    tertiaryContainer = KLBrightPurple,
    onTertiaryContainer = KLBlack,
    error = KLBrickRed,
    onError = KLWhite,
    errorContainer = KLNitroLightRed,
    onErrorContainer = KLBrickRed,
    background = KLBlack,
    onBackground = KLLightGreen,
    surface = KLHouseGreen,
    onSurface = KLBrickRed,
    surfaceVariant = KLNitroGreen,
    onSurfaceVariant = KLBlack,
    inverseSurface = KLBrightPurple,
    inverseOnSurface = KLWhite,
    outline = KLBrickRed,
)
