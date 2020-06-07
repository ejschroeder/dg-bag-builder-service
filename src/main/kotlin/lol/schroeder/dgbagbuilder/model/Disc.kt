package lol.schroeder.dgbagbuilder.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("discs")
data class Disc (
        @Id val id: String? = null,
        val manufacturer: String,
        val model: String,
        val speed: String,
        val glide: String,
        val turn: String,
        val fade: String
)