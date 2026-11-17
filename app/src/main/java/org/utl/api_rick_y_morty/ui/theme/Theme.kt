package org.utl.api_rick_y_morty.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@Composable
fun API_RICK_Y_MORTYTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        darkColorScheme(
            primary = PortalGreen,
            onPrimary = PortalDarkGreen,
            secondary = RickBlue,
            tertiary = MortyYellow,
            background = SpaceBackground,
            surface = CardSurface,
            onBackground = TextLight,
            onSurface = TextLight
        )
    } else {
        lightColorScheme(
            primary = PortalGreen,
            onPrimary = Color.White,
            secondary = Color(0xFF00796B),
            tertiary = Color(0xFFF57F17),
            background = Color(0xFFF8F9FA),
            surface = Color.White,
            onBackground = Color(0xFF12151C),
            onSurface = Color(0xFF12151C)
        )
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}