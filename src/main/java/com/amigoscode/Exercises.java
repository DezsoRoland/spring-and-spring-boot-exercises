package com.amigoscode;

/**
 * Advanced Spring Boot - Exercises
 *
 * Follow the TODOs below in order.
 * Each exercise tells you which file to edit.
 *
 * Use IntelliJ's TODO tool window (View > Tool Windows > TODO)
 * to navigate through the exercises.
 */
public class Exercises {

    // TODO: 01 - Add validation annotations to CreateOrderRequest
    //  File: order/dto/CreateOrderRequest.java
    //  Add @NotBlank(message = "Description is required") on description
    //  Add @NotNull(message = "Total amount is required") on totalAmount
    //  Add @Positive(message = "Total amount must be positive") on totalAmount

    // TODO: 02 - Trigger validation with @Valid
    //  File: order/OrderController.java
    //  Add @Valid before @RequestBody in the createOrder() method
    //  Import: jakarta.validation.Valid

    // TODO: 03 - Add @Email and @Size validation
    //  File: order/dto/CreateOrderRequest.java
    //  Add @Email(message = "Customer email must be valid") on customerEmail
    //  Add @Size(min = 5, max = 200, message = "Description must be between 5 and 200 characters") on description
    //  Add @NotBlank(message = "Customer email is required") on customerEmail

    // TODO: 04 - Create a custom validator
    //  File: order/validation/ValidOrderStatus.java — create the annotation
    //  @Constraint(validatedBy = OrderStatusValidator.class)
    //  @Target({ElementType.FIELD}), @Retention(RetentionPolicy.RUNTIME)
    //  Default message: "Status must be one of: PENDING, SHIPPED, DELIVERED, CANCELLED"
    //
    //  File: order/validation/OrderStatusValidator.java — implement ConstraintValidator
    //  Implement ConstraintValidator<ValidOrderStatus, String>
    //  Check if value is in List.of("PENDING", "SHIPPED", "DELIVERED", "CANCELLED")
    //
    //  Then apply @ValidOrderStatus to the status field in CreateOrderRequest

    // TODO: 05 - Create OrderNotFoundException with @ResponseStatus
    //  File: order/exception/OrderNotFoundException.java
    //  Extend RuntimeException
    //  Add @ResponseStatus(HttpStatus.NOT_FOUND)
    //  Constructor takes Long id, passes "Order not found with id: " + id to super()
    //  Then throw this from OrderService.getOrderById() when not found

    // TODO: 06 - Create a structured error response
    //  File: order/exception/ApiError.java
    //  Create: public record ApiError(String path, String message, int statusCode, LocalDateTime timestamp)

    // TODO: 07 - Create a global exception handler
    //  File: order/exception/GlobalExceptionHandler.java
    //  Add @ControllerAdvice
    //  Add @ExceptionHandler(OrderNotFoundException.class) returning ResponseEntity<ApiError>
    //  Build ApiError with request path, message, 404 status, and current timestamp

    // TODO: 08 - Handle validation errors globally
    //  File: order/exception/GlobalExceptionHandler.java
    //  Add @ExceptionHandler(MethodArgumentNotValidException.class)
    //  Extract field errors: ex.getBindingResult().getFieldErrors()
    //  Build message: "field: message; field: message"
    //  Return 400 Bad Request with ApiError

    // TODO: 09 - Convert Order to a JPA entity
    //  File: order/Order.java
    //  Add @Entity and @Table(name = "orders") — "order" is a reserved SQL keyword
    //  Add @Id and @GeneratedValue(strategy = GenerationType.IDENTITY) to id

    // TODO: 10 - Replace OrderRepository with JpaRepository
    //  File: order/OrderRepository.java
    //  Change from a class to: public interface OrderRepository extends JpaRepository<Order, Long>
    //  Delete all the manual List-based code
    //  Update OrderService to use JPA methods (findAll, findById, save, deleteById)

    // TODO: 11 - Add derived query methods
    //  File: order/OrderRepository.java
    //  Add: List<Order> findByStatus(String status)
    //  Add: List<Order> findByCustomerEmail(String email)

    // TODO: 12 - Add a custom @Query
    //  File: order/OrderRepository.java
    //  @Query("SELECT o FROM Order o WHERE o.totalAmount > :amount")
    //  List<Order> findByTotalAmountGreaterThan(@Param("amount") double amount)

    // TODO: 13 - Seed the database
    //  File: src/main/resources/data.sql
    //  Add INSERT statements for the orders table (at least 4 rows with different statuses)
    //  Columns: description, status, total_amount, customer_email, order_date, internal_notes

    // TODO: 14 - Build a REST client
    //  File: post/Post.java — create record Post(Long id, Long userId, String title, String body)
    //  File: post/PostClient.java — use RestClient.create("https://jsonplaceholder.typicode.com")
    //  Add getPosts() calling GET /posts, getPostById(Long id) calling GET /posts/{id}
    //  File: post/PostController.java — @RestController with GET /api/v1/posts and /api/v1/posts/{id}

    // TODO: 15 - Inject a property with @Value
    //  File: order/OrderController.java
    //  Add: @Value("${app.order.max-items}") private int maxItems;
    //  Create GET /api/v1/orders/max-items that returns maxItems

    // TODO: 16 - Create a Spring profile
    //  File: src/main/resources/application-dev.yml
    //  Set app.order.max-items to 100 and server.port to 8081
    //  Activate with: spring.profiles.active=dev in application.yml or --spring.profiles.active=dev

    // TODO: 17 - Replace System.out.println with Logger
    //  File: order/OrderController.java (and any other files using System.out)
    //  Add: private static final Logger log = LoggerFactory.getLogger(OrderController.class)
    //  Use log.info() for normal operations, log.warn() for not found, log.error() for failures

    // TODO: 18 - Enable Spring Actuator
    //  File: src/main/resources/application.yml
    //  Add management.endpoints.web.exposure.include: health,info,metrics
    //  Add management.info.env.enabled: true
    //  Test: http://localhost:8080/actuator/health

    // TODO: 19 - Secure endpoints with Spring Security
    //  File: security/SecurityConfig.java
    //  Add @Configuration and @EnableWebSecurity
    //  Create @Bean SecurityFilterChain — disable CSRF, disable frame options (for H2)
    //  Permit /h2-console/** and /actuator/**, require auth for everything else
    //  Enable HTTP Basic with Customizer.withDefaults()

    // TODO: 20 - Create an in-memory user
    //  File: security/SecurityConfig.java
    //  Create @Bean UserDetailsService — use User.builder() with username "admin", password "password", role "ADMIN"
    //  Create @Bean PasswordEncoder returning new BCryptPasswordEncoder()
    //  Encode the password with passwordEncoder().encode("password")

}
