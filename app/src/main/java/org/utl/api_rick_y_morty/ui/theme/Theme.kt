package org.utl.api_rick_y_morty.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun API_RICK_Y_MORTYTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = RickAndMortyColorScheme,
        typography = Typography,
        content = content
    )
}