package com.amigoscode;

/**
 * Spring Data JPA - Exercises
 *
 * Follow the TODOs below in order.
 * Each exercise tells you which file to edit.
 *
 * Use IntelliJ's TODO tool window (View > Tool Windows > TODO)
 * to navigate through the exercises.
 */
public class Exercises {

    // TODO: 01 - Make Student a JPA entity
    //  File: student/Student.java
    //  Add @Entity annotation
    //  Add @Id to the id field
    //  Add @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    //  Add @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")

    // TODO: 02 - Add column and table constraints to Student
    //  File: student/Student.java
    //  Add @Table(name = "students")
    //  Add @Column(name = "first_name", nullable = false, length = 100) on firstName
    //  Add @Column(name = "last_name", nullable = false, length = 100) on lastName
    //  Add @Column(nullable = false, unique = true) on email
    //  Add @Column(nullable = false) on age

    // TODO: 03 - Create StudentRepository
    //  File: student/StudentRepository.java
    //  Create an interface extending JpaRepository<Student, Long>

    // TODO: 04 - Save students and print count
    //  File: DataInitializer.java
    //  Inject StudentRepository via constructor
    //  Save 3 students: John Doe (john@gmail.com, 25), Jane Smith (jane@yahoo.com, 22), Bob Johnson (bob@gmail.com, 30)
    //  Print the count using studentRepository.count()

    // TODO: 05 - Add derived query methods
    //  File: student/StudentRepository.java
    //  Add: Optional<Student> findByEmail(String email)
    //  Add: List<Student> findByFirstNameAndLastName(String firstName, String lastName)

    // TODO: 06 - Add more derived query methods
    //  File: student/StudentRepository.java
    //  Add: List<Student> findByAgeBetween(int min, int max)
    //  Add: List<Student> findByLastNameContaining(String name)
    //  Add: List<Student> findByAgeGreaterThan(int age)

    // TODO: 07 - Add a JPQL query
    //  File: student/StudentRepository.java
    //  @Query("SELECT s FROM Student s WHERE s.email LIKE %:domain")
    //  List<Student> findByEmailDomain(@Param("domain") String domain)

    // TODO: 08 - Add a native query
    //  File: student/StudentRepository.java
    //  @Query(value = "SELECT * FROM students ORDER BY age DESC LIMIT 1", nativeQuery = true)
    //  Student findOldestStudent()

    // TODO: 09 - Add a modifying query
    //  File: student/StudentRepository.java
    //  @Modifying @Transactional
    //  @Query("UPDATE Student s SET s.email = :email WHERE s.id = :id")
    //  void updateEmailById(@Param("id") Long id, @Param("email") String email)

    // TODO: 10 - Add a sorted endpoint
    //  File: student/StudentController.java
    //  Inject StudentRepository via constructor
    //  Add GET /api/v1/students/sorted
    //  Return students sorted by lastName then firstName using Sort.by(...)

    // TODO: 11 - Add a paginated endpoint
    //  File: student/StudentController.java
    //  Add GET /api/v1/students/paged
    //  Accept Pageable as parameter, return studentRepository.findAll(pageable)

    // TODO: 12 - Create StudentIdCard entity with @OneToOne
    //  File: card/StudentIdCard.java
    //  Add @Entity, @Id, @GeneratedValue(strategy = GenerationType.IDENTITY)
    //  Add @OneToOne on the student field
    //  Add @JoinColumn(name = "student_id", referencedColumnName = "id",
    //       foreignKey = @ForeignKey(name = "student_id_card_student_fk"))

    // TODO: 13 - Configure cascade and fetch type
    //  File: card/StudentIdCard.java
    //  Update @OneToOne to include cascade = CascadeType.ALL, fetch = FetchType.LAZY

    // TODO: 14 - Make one-to-one bidirectional
    //  File: student/Student.java
    //  Add: @OneToOne(mappedBy = "student", orphanRemoval = true)
    //  private StudentIdCard studentIdCard;

    // TODO: 15 - Add one-to-many with Book
    //  File: student/Student.java
    //  Add: @OneToMany(mappedBy = "student", cascade = CascadeType.ALL, orphanRemoval = true)
    //  private List<Book> books = new ArrayList<>()

    // TODO: 16 - Make one-to-many bidirectional
    //  File: book/Book.java
    //  Add a Student field with @ManyToOne and @JoinColumn(name = "student_id")
    //  Add getter and setter for student

    // TODO: 17 - Add helper methods for Book
    //  File: student/Student.java
    //  Add addBook(Book book) — adds book and sets book.setStudent(this)
    //  Add removeBook(Book book) — removes book and sets book.setStudent(null)

    // TODO: 18 - Add many-to-many with Course
    //  File: student/Student.java — add @ManyToMany with @JoinTable(name = "student_course", ...)
    //  File: course/Course.java — add @ManyToMany(mappedBy = "courses") with Set<Student>

    // TODO: 19 - Add helper methods for Course
    //  File: student/Student.java
    //  Add enrollInCourse(Course course) — adds to both sides
    //  Add dropCourse(Course course) — removes from both sides

    // TODO: 20 - Add soft delete
    //  File: student/Student.java
    //  Add: private boolean active = true
    //  Add @SQLDelete(sql = "UPDATE students SET active = false WHERE id = ?")
    //  Add @SQLRestriction("active = true")

    // TODO: 21 - Add auditing annotations
    //  File: student/Student.java
    //  Add @EntityListeners(AuditingEntityListener.class)
    //  Add @CreatedDate on: private LocalDateTime createdAt (with @Column(nullable = false, updatable = false))
    //  Add @LastModifiedDate on: private LocalDateTime updatedAt

    // TODO: 22 - Enable JPA Auditing and AuditorAware
    //  File: config/AuditingConfig.java
    //  Add @Configuration and @EnableJpaAuditing
    //  Create a @Bean returning AuditorAware<String> — return () -> Optional.of("system")
    //  Then in Student, add @CreatedBy and @LastModifiedBy on new String fields

    // TODO: 23 - Create StudentDTO and projection endpoint
    //  File: student/StudentDTO.java — create record StudentDTO(String fullName, String email)
    //  File: student/StudentController.java — add GET /api/v1/students/dto
    //  Map each Student to StudentDTO(firstName + " " + lastName, email)

    // TODO: 24 - Implement transactional transfer
    //  File: account/AccountService.java
    //  Add @Transactional to the transfer method
    //  Find sender and receiver by ID, check balance, debit sender, credit receiver, save both

    // TODO: 25 - Test transaction rollback
    //  File: account/AccountService.java
    //  Create transferWithBug() — same as transfer but throw RuntimeException after debiting sender
    //  @Transactional should rollback the debit automatically

}
