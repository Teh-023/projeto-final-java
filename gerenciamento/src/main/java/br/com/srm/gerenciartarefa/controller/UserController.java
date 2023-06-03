package br.com.srm.gerenciartarefa.controller;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.srm.gerenciartarefa.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;



@Controller
@RequestMapping("/login")
public class UserController<UserRepository> {


    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(@RequestParam("username") User username, @RequestParam("password") String password) {
        User user = UserService.getUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return "redirect:/tasks";
        } else {
            return "redirect:/login?error";
        }
    }
}



