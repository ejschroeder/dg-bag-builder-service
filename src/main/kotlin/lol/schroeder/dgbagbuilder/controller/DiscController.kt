package lol.schroeder.dgbagbuilder.controller

import lol.schroeder.dgbagbuilder.annotation.Filters
import lol.schroeder.dgbagbuilder.model.Disc
import lol.schroeder.dgbagbuilder.repository.FilterCriteria
import lol.schroeder.dgbagbuilder.service.DiscService
import lol.schroeder.dgbagbuilder.service.FilterTransformationService
import org.slf4j.LoggerFactory
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.util.MultiValueMap
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/discs")
class DiscController(private val discService: DiscService, private val filterTransformationService: FilterTransformationService) {

    private val log = LoggerFactory.getLogger(DiscController::class.java)

    @GetMapping
    fun getAllDiscs(@RequestParam filterCritera: MultiValueMap<String, String>): ResponseEntity<MutableList<Disc>> {
//        val filters = params
//                .filterKeys { it.startsWith("filter.") }
//                .mapKeys { it.key.substringAfter("filter.") }

        return ResponseEntity(discService.getAllDiscs(), HttpStatus.OK)
    }

    @GetMapping("/{id}")
    fun getDisc(@PathVariable id: String): ResponseEntity<Disc> {
        val disc: Disc? = discService.getDisc(id).orElse(null)
        return if (disc != null) {
            ResponseEntity(disc, HttpStatus.OK)
        } else {
            ResponseEntity(HttpStatus.NOT_FOUND)
        }
    }

}