package lol.schroeder.dgbagbuilder.model.dto

data class BagDto(val id: String, val name: String, val description: String, val discs: List<DiscDto>)