package org.utl.api_rick_y_morty.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val PortalGreen = Color(0xFF97CE4C)      // Verde portal neón (Primario)
val PortalDarkGreen = Color(0xFF0D1405)  // Contraste oscuro sobre botón verde
val RickBlue = Color(0xFFA6EEEE)         // Azul cabello de Rick (Secundario)
val MortyYellow = Color(0xFFF0E14A)      // Amarillo camiseta de Morty (Terciario)
val SpaceBackground = Color(0xFF12151C)  // Fondo oscuro espacial
val CardSurface = Color(0xFF1E232E)      // Color de las tarjetas
val TextLight = Color(0xFFF5F7FA)        // Texto principal claro
val StatusDeadRed = Color(0xFFFF5252)    // Rojo para estado "Dead"

val RickAndMortyColorScheme = darkColorScheme(
    primary = PortalGreen,
    onPrimary = PortalDarkGreen,
    secondary = RickBlue,
    tertiary = MortyYellow,
    background = SpaceBackground,
    surface = CardSurface,
    onBackground = TextLight,
    onSurface = TextLight
)