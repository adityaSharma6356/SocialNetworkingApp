package com.example.socialnetworkapp.presentation.theme.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.socialnetworkapp.R


val quicksand = FontFamily(
    Font(R.font.quicksand_bold,FontWeight.Bold),
    Font(R.font.quicksand_light,FontWeight.Light),
    Font(R.font.quicksand_medium,FontWeight.Medium),
    Font(R.font.quicksand_regular,FontWeight.Normal),
    Font(R.font.quicksand_semibold,FontWeight.SemiBold)
)
// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = quicksand,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        color = TextWhite,
    ),
    headlineLarge = TextStyle(
      fontFamily = quicksand,
        fontWeight = FontWeight.Bold,
        color = TextWhite,
        fontSize = 30.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = quicksand,
        fontWeight = FontWeight.Medium,
        color = TextWhite,
        fontSize = 24.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = quicksand,
        fontWeight = FontWeight.Normal,
        color = TextWhite,
        fontSize = 12.sp
    )

)