package com.tamzi.mkahawa.atoms.type

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import com.tamzi.mkahawa.atoms.type.KahawaTypographyKeyTokens.*

/**
 * The Material Design type scale includes a range of contrasting styles that support the needs of
 * your product and its content.
 *
 * Use typography to make writing legible and beautiful. Material's default type scale includes
 * contrasting and flexible styles to support a wide range of use cases.
 *
 * The type scale is a combination of thirteen styles that are supported by the type system. It
 * contains reusable categories of text, each with an intended application and meaning.
 *
 * To learn more about typography, see [Material Design typography](https://m3.material.io/styles/typography/overview).
 *
 * @property displayLarge displayLarge is the largest display text.
 * @property displayMedium displayMedium is the second largest display text.
 * @property displaySmall displaySmall is the smallest display text.
 * @property headlineLarge headlineLarge is the largest headline, reserved for short, important text
 * or numerals. For headlines, you can choose an expressive font, such as a display, handwritten, or
 * script style. These unconventional font designs have details and intricacy that help attract the
 * eye.
 * @property headlineMedium headlineMedium is the second largest headline, reserved for short,
 * important text or numerals. For headlines, you can choose an expressive font, such as a display,
 * handwritten, or script style. These unconventional font designs have details and intricacy that
 * help attract the eye.
 * @property headlineSmall headlineSmall is the smallest headline, reserved for short, important
 * text or numerals. For headlines, you can choose an expressive font, such as a display,
 * handwritten, or script style. These unconventional font designs have details and intricacy that
 * help attract the eye.
 * @property titleLarge titleLarge is the largest title, and is typically reserved for
 * medium-emphasis text that is shorter in length. Serif or sans serif typefaces work well for
 * subtitles.
 * @property titleMedium titleMedium is the second largest title, and is typically reserved for
 * medium-emphasis text that is shorter in length. Serif or sans serif typefaces work well for
 * subtitles.
 * @property titleSmall titleSmall is the smallest title, and is typically reserved for
 * medium-emphasis text that is shorter in length. Serif or sans serif typefaces work well for
 * subtitles.
 * @property bodyLarge bodyLarge is the largest body, and is typically used for long-form writing as
 * it works well for small text sizes. For longer sections of text, a serif or sans serif typeface
 * is recommended.
 * @property bodyMedium bodyMedium is the second largest body, and is typically used for long-form
 * writing as it works well for small text sizes. For longer sections of text, a serif or sans serif
 * typeface is recommended.
 * @property bodySmall bodySmall is the smallest body, and is typically used for long-form writing
 * as it works well for small text sizes. For longer sections of text, a serif or sans serif
 * typeface is recommended.
 * @property labelLarge labelLarge text is a call to action used in different types of buttons (such
 * as text, outlined and contained buttons) and in tabs, dialogs, and cards. Button text is
 * typically sans serif, using all caps text.
 * @property labelMedium labelMedium is one of the smallest font sizes. It is used sparingly to
 * annotate imagery or to introduce a headline.
 * @property labelSmall labelSmall is one of the smallest font sizes. It is used sparingly to
 * annotate imagery or to introduce a headline.
 */

@Immutable
class KahawaTypography(
    val kahawaTitleText: TextStyle = KahawaTypographyTokens.KahawaTitleText,
    val kahawaParagraphText: TextStyle = KahawaTypographyTokens.KahawaParagraphText,
    val kahawaCardTitle: TextStyle = KahawaTypographyTokens.KahawaCardTitle,
    val kahawaButtonText: TextStyle = KahawaTypographyTokens.KahawaButtonText,
    val kahawaAppBarTitleText : TextStyle = KahawaTypographyTokens.KahawaAppBarTitleText,
    val kahawaSubTitleText: TextStyle = KahawaTypographyTokens.KahawaSubTitleText,
    val kahawaAppBarDescription: TextStyle = KahawaTypographyTokens.KahawaAppBarDescription,
    val kahawaHintText: TextStyle = KahawaTypographyTokens.KahawaHintText,
) {

    /** Returns a copy of this Typography, optionally overriding some of the values. */
    fun copy(
        kahawaTitleText: TextStyle = this.kahawaTitleText,
        kahawaParagraphText: TextStyle = this.kahawaParagraphText,
        kahawaCardTitle: TextStyle = this.kahawaCardTitle,
        kahawaButtonText: TextStyle = this.kahawaButtonText,
        kahawaAppBarTitleText: TextStyle = this.kahawaAppBarTitleText,
        kahawaSubTitleText: TextStyle = this.kahawaSubTitleText,
        kahawaAppBarDescription: TextStyle = this.kahawaAppBarDescription,
        kahawaHintText: TextStyle = this.kahawaHintText,
    ): KahawaTypography =
        KahawaTypography(
            kahawaTitleText = kahawaTitleText,
            kahawaParagraphText = kahawaParagraphText,
            kahawaCardTitle = kahawaCardTitle,
            kahawaButtonText = kahawaButtonText,
            kahawaAppBarTitleText = kahawaAppBarTitleText,
            kahawaSubTitleText = kahawaSubTitleText,
            kahawaAppBarDescription = kahawaAppBarDescription,
            kahawaHintText = kahawaHintText,
        )
}


internal fun KahawaTypography.fromToken(value: KahawaTypographyKeyTokens): TextStyle {
    return when (value) {
        KahawaTitleText -> kahawaTitleText
        KahawaParagraphText -> kahawaParagraphText
        KahawaCardTitle -> kahawaCardTitle
        KahawaButtonText -> kahawaButtonText
        KahawaAppBarTitleText -> kahawaAppBarTitleText
        KahawaSubTitleText -> kahawaSubTitleText
        KahawaAppBarDescription -> kahawaAppBarDescription
        KahawaHintText -> kahawaHintText
    }
}

internal val LocalTypography = staticCompositionLocalOf { KahawaTypography() }
