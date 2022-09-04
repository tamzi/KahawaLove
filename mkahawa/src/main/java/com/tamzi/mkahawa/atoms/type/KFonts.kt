/*
 * Copyright 2022 DroidconKE
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tamzi.mkahawa.atoms.type

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.tamzi.mkahawa.R


/**
 * Chai typography:
 * Consists of 2 files that work together:
 *  - CTypography(located ion the components package) and
 *  - CFont located in the atoms directory
 * Font:
 * Defines the font family types only here
 * We use val for the purpose of making it available in the entire application
 * You first add the fonts to the res folder under fonts
 * Then just reference them here.
 * Font-  List all fonts that will be used in the application
 *
 */

/**
 * Kenyan Coffee font
 * */
val KenyanCoffeeBold = FontFamily(Font(R.font.kenyan_coffee_bold))
val KenyanCoffeeRegular = FontFamily(Font(R.font.kenyan_coffee_regular))

/**
 * Pike Font:
 * ued for special cards events
 * */
val Pike = FontFamily(Font(R.font.pike))


/**
 * Poppins Font:
 * For body text
 * */
val PoppinsRegular = FontFamily(Font(R.font.poppins_regular))
val PoppinsBold = FontFamily(Font(R.font.poppins_bold))
val PoppinsLight = FontFamily(Font(R.font.poppins_light))
val PoppinsMedium = FontFamily(Font(R.font.poppins_medium))
val PoppinsSemiBold = FontFamily(Font(R.font.poppins_semi_bold))

/**
 * SodoSans Font
 * */
val SodoSansSemiBold = FontFamily(Font(R.font.pike))

/**
 * Trade Gothic: Card and body fonts
 * */
val TradeGothicLT = FontFamily(Font(R.font.trade_gothic_lt))
val TradeGothicLTStdRegular = FontFamily(Font(R.font.trade_gothic_lt_std_regular))

