package com.amigoscode;

/**
 * Spring Boot - Exercises
 *
 * Follow the TODOs below in order.
 * Each exercise tells you which file to edit.
 *
 * Use IntelliJ's TODO tool window (View > Tool Windows > TODO)
 * to navigate through the exercises.
 */
public class Exercises {

    // TODO: 01 - Define the Book entity
    //  File: book/Book.java
    //  Add @Entity annotation to the class
    //  Add @Id and @GeneratedValue(strategy = GenerationType.IDENTITY) to the id field
    //  Add a no-arg constructor (required by JPA)

    // TODO: 02 - Create BookRepository
    //  File: book/BookRepository.java
    //  Create an interface that extends JpaRepository<Book, Long>
    //  You don't need to add any methods — JpaRepository provides them all

    // TODO: 03 - GET all books
    //  File: book/BookController.java
    //  Inject BookRepository via constructor injection
    //  Create a @GetMapping endpoint mapped to "/api/v1/books"
    //  Return bookRepository.findAll()

    // TODO: 04 - GET book by ID
    //  File: book/BookController.java
    //  Create a @GetMapping endpoint mapped to "/api/v1/books/{id}"
    //  Use @PathVariable Long id and bookRepository.findById(id)
    //  Return 404 if the book is not found

    // TODO: 05 - POST a new book
    //  File: book/BookController.java
    //  Create a @PostMapping endpoint mapped to "/api/v1/books"
    //  Accept a @RequestBody Book and save it with bookRepository.save(book)

    // TODO: 06 - DELETE a book by ID
    //  File: book/BookController.java
    //  Create a @DeleteMapping endpoint mapped to "/api/v1/books/{id}"
    //  Use @PathVariable Long id and bookRepository.deleteById(id)

}
