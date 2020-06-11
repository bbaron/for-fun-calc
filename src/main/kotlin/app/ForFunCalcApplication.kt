package app

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ForFunCalcApplication

fun main(args: Array<String>) {
    runApplication<ForFunCalcApplication>(*args)
}
