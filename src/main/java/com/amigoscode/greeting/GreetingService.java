package com.amigoscode.greeting;

// TODO: 1 - Annotate this class with @Component so Spring manages it as a bean
public class GreetingService {

    private final String greeting;

    public GreetingService(String greeting) {
        this.greeting = greeting;
    }

    public String greet(String name) {
        return greeting + ", " + name + "!";
    }

    // TODO: 4 - Add a method annotated with @PostConstruct that prints
    //  "GreetingService has been initialized"
    //  Add a method annotated with @PreDestroy that prints
    //  "GreetingService is being destroyed"

}
