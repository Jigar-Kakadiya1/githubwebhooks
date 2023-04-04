package com.example.githubwebhook;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
public class UserController {

    @GetMapping("/user")
    public String user() {
        return "Hello User! welcome again 1 2 3";
    }

    @GetMapping("/")
    public String home() {
        return "welcome to home! test";
    }

    @GetMapping("/users")
    public String users() {
        return Arrays.asList("a", "b", "c").toString();
    }
}
