package com.amigoscode.greeting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    // TODO: 2 - Inject GreetingService into this controller using constructor injection

    @GetMapping("/api/v1/greetings/{name}")
    public String greet(@PathVariable String name) {
        // TODO: 2 - Use the injected GreetingService to return a greeting
        return "not yet implemented";
    }

}
