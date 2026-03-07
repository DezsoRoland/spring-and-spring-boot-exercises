package com.amigoscode.user;

import java.util.List;

// TODO: 5 - Annotate this class with @Repository
public class UserRepository {

    public List<String> findAllUsers() {
        return List.of("Alice", "Bob", "Charlie");
    }

}
