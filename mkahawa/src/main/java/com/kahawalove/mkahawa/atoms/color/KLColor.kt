package com.kahawalove.mkahawa.atoms.color

import androidx.compose.ui.graphics.Color

// Thinking....create the app colour scheme and not depend on material theme??
// Foundation would make sense to depend on material theme but not the app colour scheme on iteration 2


/** Note on the color scheme:
 * All app backgrounds will be KLWarmNeutral
 *
 * The shades colours are for the seasons that we are in.
 * The Schemes are for the different seasons.
 * The idea is to have a base color and then have shades of that color depending on the season.
 * The base color will be the main color of the season.
 *
 *
 * All brand colours for all occasions are defined here.
 * They are not accessible outside this file to be called individually
 *
 *
*/


/** Base Brand colors*/
internal val KLGreen = Color(0xFF006241)
internal val KLAccentGreen = Color(0xFF00704A)
internal val KLLightGreen = Color(0xFFD4E9E2)
internal val KLHouseGreen = Color(0xFF1E3932)
internal val KLBlack = Color(0xFF000000)
internal val KLLightBlack = Color(0xFF22292F)
internal val KLWarmNeutral = Color(0xFFF2F0EB)
internal val KLCoolNeutral = Color(0xFFF9F9F9)
internal val KLWhite = Color(0xFFFFFFFF)
internal val KLBrightRed = Color(0xFFD62F2F)
internal val KLLightRed = Color(0xFFFBEAEA)
internal val KLDarkRed = Color(0xFFA00000)


/** Shades of Spring:
 *
 * to this scheme we have a base of already existing:
 *  - `KLGreen`,
 *  - `KLHouseGreen`,
 *  - `KLLightGreen`,
 *
 * */
internal val KLSpringYellow = Color(0xFFEED350)
internal val KLLightBlue = Color(0xFFB6CBD5)
internal val KLSpringCoral = Color(0xFFD3705A)
internal val KLTeal = Color(0xFF005E66)
internal val KLTurquoise = Color(0xFF4C9F87)
internal val KLGoldenrod = Color(0xFFC89543)
internal val KLSpringGreen = Color(0xFFC0D48B)
internal val KLBlush = Color(0xFFEDC4C9)

/** Shades of Summer:
 *
 * to this scheme we have a base of already existing:
 *  - `KLGreen`,
 *  - `KLHouseGreen`,
 *  - `KLLightGreen`,
 *
 * */
internal val KLSummerMauve = Color(0xFFDD92C0)
internal val KLPeach = Color(0xFFf0CDBC)
internal val KLSummerYellow = Color(0xFFf0E0B0)
internal val KLSoftPink = Color(0xFFf0D4DC)
internal val KLBrightGreen = Color(0xFF4CA06F)
internal val KLVibrantOrange = Color(0xFFDC714E)
internal val KLLightOrange = Color(0xFFFCE6E2)


/** Shades of Nitro:
 *
 * to this scheme we have a base of already existing:
 *  - `KLGreen`,
 *  - `KLHouseGreen`,
 *  - `KLLightGreen`,
 *  - `KLBlack`,
 *  - `KLBrickRed`
 *
 * */
internal val KLBrickRed = Color(0xFFFF6740)
internal val KLNitroGreen = Color(0xFF3ECEA9)
internal val KLNitroCoral = Color(0xFFE76069)
internal val KLBrightPurple = Color(0xFF8882F4)


/** Shades of Fall:
 *
 * to this scheme we have a base of already existing:
 *  - `KLGreen`,
 *  - `KLHouseGreen`,
 *  - `KLLightGreen`,
 *  - `KLBlack`,
 *
 * */
internal val KLRust = Color(0xFF9D5116)
internal val KLNeutralPink = Color(0xFFEBCABC)
internal val KLAlmostPumpkin = Color(0xFFE44C2C)
internal val KLMustard = Color(0xFFA17700)
internal val KLBurgandy = Color(0xFF8882F4)



/**
 * Others:
 *
 * These are other shades of brown we may need to use
 * BUT have not been assigned to a season or schemeColor
 * */

internal val KLBrown = Color(0xFF9D5217)
internal val KLOrange = Color(0xFFC99543)
internal val KLDarkerLightOrange = Color(0xFFDBB781)
internal val KLGrey = Color(0xFFE4DFD7)
internal val KLLightGrey = Color(0xFFF4F0E3)
