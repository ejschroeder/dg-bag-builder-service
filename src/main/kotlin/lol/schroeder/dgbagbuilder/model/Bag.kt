package lol.schroeder.dgbagbuilder.model

import org.springframework.data.annotation.Id

data class Bag(
        @Id val id: String,
        val name: String = "Default",
        val description: String = ""
)