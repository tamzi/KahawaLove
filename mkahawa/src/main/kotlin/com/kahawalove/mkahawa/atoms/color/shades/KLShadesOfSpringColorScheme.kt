package com.kahawalove.mkahawa.atoms.color.shades

import androidx.annotation.VisibleForTesting
import androidx.compose.material3.lightColorScheme
import com.kahawalove.mkahawa.atoms.color.KLBlush
import com.kahawalove.mkahawa.atoms.color.KLBrightRed
import com.kahawalove.mkahawa.atoms.color.KLDarkRed
import com.kahawalove.mkahawa.atoms.color.KLGoldenrod
import com.kahawalove.mkahawa.atoms.color.KLGreen
import com.kahawalove.mkahawa.atoms.color.KLHouseGreen
import com.kahawalove.mkahawa.atoms.color.KLLightBlack
import com.kahawalove.mkahawa.atoms.color.KLLightBlue
import com.kahawalove.mkahawa.atoms.color.KLLightGreen
import com.kahawalove.mkahawa.atoms.color.KLLightRed
import com.kahawalove.mkahawa.atoms.color.KLSpringCoral
import com.kahawalove.mkahawa.atoms.color.KLSpringGreen
import com.kahawalove.mkahawa.atoms.color.KLSpringYellow
import com.kahawalove.mkahawa.atoms.color.KLTeal
import com.kahawalove.mkahawa.atoms.color.KLTurquoise
import com.kahawalove.mkahawa.atoms.color.KLWhite

// Open Questions captured in @see:KLColor

/**
 * [KLColor](KLColor.kt)
 *
 * Shades of Spring:
 *
 * The [ShadesOfSpringColorScheme] blends vibrant, fresh tones with natural greens, yellows,
 * and corals, evoking renewal, warmth, and growth. It's a perfect color palette for a light,
 * inviting, and spring-like interface, balancing bright and muted tones for
 * a harmonious user experience.
 *
 * This Color scheme has the following colors:
 *
 * - KLGreen
 * - KLHouseGreen
 * - KLLightGreen
 * - KLSpringYellow
 * - KLLightBlue
 * - KLSpringCoral
 * - KLTeal
 * - KLTurquoise
 * - KLGoldenrod
 * - KLSpringGreen
 * - KLBlush
 * - KLBrightRed
 * - KLLightRed
 * - KLDarkRed
 *
 * `Primary`: KLGreen
 *    - This deep green is the foundation color.
 *    It can be used for buttons, navigation bars, or other prominent elements.
 *
 * `onPrimary`: KLLightGreen
 *    - To ensure high contrast, we use the light green on top of the primary green.
 *    This combination evokes freshness and is easy on the eyes.
 *
 * `PrimaryContainer`: KLHouseGreen
 *    - A deeper variant of green used for backgrounds of primary components like cards,
 *    adding depth while maintaining consistency.
 *
 * `onPrimaryContainer`: KLSpringYellow
 *    - The bright spring yellow provides a cheerful and highly contrasting accent on primary
 *    containers, adding a sense of warmth and spring vitality.
 *
 * `Secondary`: KLSpringCoral
 *    - This rich coral color is vibrant and fresh, perfect for secondary elements
 *    like call-to-action buttons or links.
 *
 * `onSecondary`: KLTeal
 *    - A muted teal used on coral-colored backgrounds ensures good readability
 *    while adding a complementary tone.
 *
 * `SecondaryContainer`: KLLightGreen
 *    - This soft light green acts as a secondary container,
 *    creating a soothing and balanced background for secondary components.
 *
 * `onSecondaryContainer`: KLSpringCoral
 *    - Coral text or icons on light green backgrounds introduce a fresh spring
 *    vibe and maintain visual hierarchy.
 *
 * `Tertiary`: KLSpringYellow
 *    - The spring yellow adds a bright, positive touch as the tertiary color.
 *    It can be used for accent elements or highlights.
 *
 * `onTertiary`: KLHouseGreen
 *    - Dark green ensures legibility and contrast when used for text or icons on the
 *    bright yellow background, keeping the palette grounded.
 *
 * `TertiaryContainer`: KLTurquoise
 *    - This turquoise brings a sense of freshness and lightness when used as a
 *    tertiary container color, perfect for smaller elements like badges or notifications.
 *
 * `onTertiaryContainer`: KLGreen
 *    - White text on turquoise ensures a clean, modern look while being highly readable.
 *
 * `Error`: KLBrightRed
 *    - For error states, we introduce a bright red that stands out and
 *    contrasts well with the spring-like palette without overwhelming it.
 *
 * `onError`: KLWhite
 *    - White text ensures visibility on error backgrounds, maintaining clarity.
 *
 * `ErrorContainer`: KLLightRed
 *    - A softer red for error containers creates a less intrusive warning
 *    or error state, aligning with the overall lightness of the spring theme.
 *
 * `onErrorContainer`: KLDarkRed
 *    - A dark red ensures legibility on lighter error containers while keeping the
 *    error message noticeable.
 *
 * `Background`: KLLightBlue
 *    - A soothing light blue is used as the main background color,
 *    evoking calmness and balance, while allowing other colors to stand out.
 *
 * `onBackground`: KLTeal
 *    - Text on the background should use the muted teal,
 *    providing a contrasting but harmonious color that reads well on light blue.
 *
 * `Surface`: KLSpringGreen
 *    - A light, soft green for surfaces like cards or sheets introduces freshness and
 *    evokes a sense of renewal.
 *
 * `onSurface`: KLLightBlack
 *    - A soft black provides contrast on the spring green surfaces, ensuring legibility
 *    while keeping the theme grounded.
 *
 * `SurfaceVariant`: KLLightGreen
 *    - This variant of light green adds layers and texture to the design, perfect for
 *    subtle separations in components.
 *
 * `onSurfaceVariant`: KLGoldenrod
 *    - Goldenrod text on the light green variant adds a warm touch, connecting the palette
 *    to a more natural, earthy feeling.
 *
 * `InverseSurface`: KLTeal
 *    - Inverse surfaces use the muted teal for elements like modals or dark mode backgrounds,
 *    adding depth and distinction.
 *
 * `InverseOnSurface`: KLLightGreen
 *    - Light green contrasts well on the dark teal background, maintaining legibility and
 *    coherence in inverse elements.
 *
 * `Outline`: KLBlush
 *    - A soft blush color can be used for outlines, providing structure while adding a subtle
 *    warmth to the overall scheme.
 *
 *
 * */



val ShadesOfSpringColorScheme = lightColorScheme(
    primary = KLGreen,
    onPrimary = KLLightGreen,
    primaryContainer = KLHouseGreen,
    onPrimaryContainer = KLSpringYellow,
    secondary = KLSpringCoral,
    onSecondary = KLTeal,
    secondaryContainer = KLLightGreen,
    onSecondaryContainer = KLSpringCoral,
    tertiary = KLSpringYellow,
    onTertiary = KLHouseGreen,
    tertiaryContainer = KLTurquoise,
    onTertiaryContainer = KLGreen,
    error = KLBrightRed,
    onError = KLWhite,
    errorContainer = KLLightRed,
    onErrorContainer = KLDarkRed,
    background = KLLightBlue,
    onBackground = KLTeal,
    surface = KLSpringGreen,
    onSurface = KLLightBlack,
    surfaceVariant = KLLightGreen,
    onSurfaceVariant = KLGoldenrod,
    inverseSurface = KLTeal,
    inverseOnSurface = KLLightGreen,
    outline = KLBlush,
)


// To Add: Corresponding Dark Color Scheme
