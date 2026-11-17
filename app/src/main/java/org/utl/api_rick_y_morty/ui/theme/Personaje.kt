package org.utl.api_rick_y_morty.ui.theme
data class PersonajesResponse(
    val results: List<Personaje>
)

data class Personaje(
    val id: Int,
    val name: String,
    val status: String,
    val species: String,
    val gender: String,
    val image: String
)