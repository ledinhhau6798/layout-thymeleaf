package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LauoutController {
    @GetMapping("/users.html")
    public String userOveriew(){
        return "user-overview";
    }

    @GetMapping("/users-leaderboard.html")
    public String leaderboard(){
        return "user-leaderboard";
    }
}
