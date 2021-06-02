package poc.yogendra.springbootmetrics.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/helloworld")
class HelloWorldController {

    @GetMapping()
    fun sayHello() = "Hello World"
}