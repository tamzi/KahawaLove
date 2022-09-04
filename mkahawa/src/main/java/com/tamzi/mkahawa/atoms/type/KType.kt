package com.tamzi.mkahawa.atoms.type

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

val KahawaTypography = KTypography(
    KahawaTitleText = TextStyle(
        fontFamily = SodoSansSemiBold,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.10000000149011612.sp,
        lineHeight = 20.sp,
        fontSize = 14.sp
    ),
    kahawaButtonText = TextStyle(
        fontFamily = PoppinsBold,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.5.sp,
        lineHeight = 16.sp,
        fontSize = 12.sp
    ),
    kahawaCardTitle = TextStyle(
        fontFamily = PoppinsRegular,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.5.sp,
        lineHeight = 16.sp,
        fontSize = 11.sp
    ),
    kahawaBodyText = TextStyle(
        fontFamily = PoppinsRegular,
        fontWeight = FontWeight.Medium,
        letterSpacing = 0.5.sp,
        lineHeight = 16.sp,
        fontSize = 11.sp
    ),
)