package lol.schroeder.dgbagbuilder.controller

import lol.schroeder.dgbagbuilder.model.dto.BagDto
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*

@Controller
@RequestMapping("/bags")
class BagController {
    @GetMapping("/{id}")
    fun getBag(@PathVariable id: String): ResponseEntity<BagDto> {
        return ResponseEntity(HttpStatus.OK)
    }
}