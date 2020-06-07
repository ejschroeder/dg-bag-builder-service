package lol.schroeder.dgbagbuilder.annotation

import lol.schroeder.dgbagbuilder.repository.FilterCriteria
import org.slf4j.LoggerFactory
import org.springframework.context.support.EmbeddedValueResolutionSupport
import org.springframework.format.AnnotationFormatterFactory
import org.springframework.format.Formatter
import org.springframework.format.Parser
import org.springframework.format.Printer
import java.util.*

class AnnotationFormatterFactory : EmbeddedValueResolutionSupport(), AnnotationFormatterFactory<Filters> {
    private val log = LoggerFactory.getLogger(lol.schroeder.dgbagbuilder.annotation.AnnotationFormatterFactory::class.java)

    override fun getParser(p0: Filters, p1: Class<*>): Parser<*> {
        return configureFormatter(p0)
    }

    override fun getPrinter(p0: Filters, p1: Class<*>): Printer<*> {
        return configureFormatter(p0)
    }

    override fun getFieldTypes(): MutableSet<Class<*>> {
        return mutableSetOf(Map::class.java)
    }

    private fun configureFormatter(annotation: Filters): Formatter<Map<String, FilterCriteria>> {
        return object: Formatter<Map<String, FilterCriteria>> {
            override fun print(p0: Map<String, FilterCriteria>, p1: Locale): String {
                return p0.toString()
            }

            override fun parse(p0: String, p1: Locale): Map<String, FilterCriteria> {
                log.info("Parsing: {}", p0)
                return mapOf()
            }

        }
    }
}