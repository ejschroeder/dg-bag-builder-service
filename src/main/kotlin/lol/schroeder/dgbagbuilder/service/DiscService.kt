package lol.schroeder.dgbagbuilder.service

import lol.schroeder.dgbagbuilder.model.Disc
import lol.schroeder.dgbagbuilder.repository.DiscRepository
import org.springframework.stereotype.Service

@Service
class DiscService(private val discRepository: DiscRepository) {
    fun getAllDiscs(filters: Map<String, List<String>> = mapOf()): MutableList<Disc> {
        return discRepository.findAll()
    }
    fun getDisc(id: String) = discRepository.findById(id)
}