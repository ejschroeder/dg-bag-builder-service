package lol.schroeder.dgbagbuilder.repository

import lol.schroeder.dgbagbuilder.model.Disc

class FilterCriteria(val field: String, val operator: FilterOperation, val value: String) {
}

enum class FilterOperation {
    EQUALS, GTE, LTE
}