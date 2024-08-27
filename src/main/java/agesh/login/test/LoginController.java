package agesh.login.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String home() {
        return "home";
    }
    @GetMapping("/dashboard")
    public String dashboard(){
        return "dashboard";
    }
    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }
}