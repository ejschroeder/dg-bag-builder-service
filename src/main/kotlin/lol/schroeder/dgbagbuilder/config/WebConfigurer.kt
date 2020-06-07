package lol.schroeder.dgbagbuilder.config

import lol.schroeder.dgbagbuilder.annotation.AnnotationFormatterFactory
import org.springframework.context.annotation.Configuration
import org.springframework.format.FormatterRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebConfigurer : WebMvcConfigurer {
    override fun addFormatters(registry: FormatterRegistry) {
        super.addFormatters(registry)
        registry.addFormatterForFieldAnnotation(AnnotationFormatterFactory())
    }
}