// LoginController.java
@Controller
@RequestMapping("/login")
public class LoginController {
    @GetMapping
    public String loginForm(Model model) {
        return "login";
    }

    @PostMapping
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        // Spring Security will handle the login logic
        return "redirect:/home";
    }
}