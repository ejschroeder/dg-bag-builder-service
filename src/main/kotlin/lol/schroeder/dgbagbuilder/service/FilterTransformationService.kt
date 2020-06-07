package lol.schroeder.dgbagbuilder.service

import lol.schroeder.dgbagbuilder.repository.FilterCriteria
import lol.schroeder.dgbagbuilder.repository.FilterOperation
import org.springframework.stereotype.Component

@Component
class FilterTransformationService {
    private val filterRegex = Regex("^(\\w+)(\\[\\w+])?$")

    fun toFilterCriteria(filters: Map<String, MutableList<String>>): List<FilterCriteria> {
        return filters.flatMap {
            val matchResult = filterRegex.matchEntire(it.key)
            if (matchResult != null) {
                val (field, operator) = matchResult.destructured
                return it.value.map { FilterCriteria(field, getFilterOperation(operator), it) }
            }
            return listOf()
        }
    }

    private fun getFilterOperation(operator: String): FilterOperation {
        return FilterOperation.EQUALS
    }
}