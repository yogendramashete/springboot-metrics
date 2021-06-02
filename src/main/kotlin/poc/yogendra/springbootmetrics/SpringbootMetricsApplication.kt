package poc.yogendra.springbootmetrics

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringbootMetricsApplication

fun main(args: Array<String>) {
	runApplication<SpringbootMetricsApplication>(*args)
}
