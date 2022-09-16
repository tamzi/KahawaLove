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
package com.tamzi.mkahawa.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.tamzi.mkahawa.atoms.kahawaBlack
import com.tamzi.mkahawa.atoms.type.PoppinsRegular

/**
 * CTypography:
 * Typography( From  is the art of arranging letters and text in a way that makes the copy legible, clear, and visually appealing to the reader.
 * It involves font style, appearance, and structure, which aims to elicit certain emotions and convey specific messages.
 * In short, typography is what brings the text to life.
 *
 * */

@Composable
fun CParagraph(dParagraph: String) {
    Text(
        text = dParagraph,
        style = TextStyle(
            color = kahawaBlack,
            fontSize = 23.sp,
            fontWeight = FontWeight.W700,
            fontFamily = PoppinsRegular,
        ),
        modifier = Modifier.fillMaxWidth()
    )
}

