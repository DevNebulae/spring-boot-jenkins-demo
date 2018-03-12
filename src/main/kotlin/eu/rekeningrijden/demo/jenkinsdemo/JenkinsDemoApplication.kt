package eu.rekeningrijden.demo.jenkinsdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/greeting")
class GreetingController {
    @GetMapping
    fun greet(): String {
        return "Hello world!"
    }
}

@SpringBootApplication
class JenkinsDemoApplication

fun main(args: Array<String>) {
    runApplication<JenkinsDemoApplication>(*args)
}
