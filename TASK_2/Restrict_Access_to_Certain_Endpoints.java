// UserController.java
@RestController
@RequestMapping("/api/users")
public class UserController {
    @GetMapping
    @Secured("ROLE_ADMIN")
    public List<User> getUsers() {
        // Return a list of users
    }

    @GetMapping("/{id}")
    @Secured("ROLE_USER")
    public User getUser(@PathVariable Long id) {
        // Return a user by ID
    }
}