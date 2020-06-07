package lol.schroeder.dgbagbuilder.repository

import lol.schroeder.dgbagbuilder.model.Disc
import org.springframework.data.mongodb.repository.MongoRepository

interface DiscRepository : MongoRepository<Disc, String> {
}