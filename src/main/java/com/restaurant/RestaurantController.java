package com.restaurant;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class RestaurantController {
    
    @GetMapping("/admin")
    public String contact() {
        return "this is a admin page";
    }

    @GetMapping("/homepage")
    public String home() {
        return "Welcome to homepage!";
    }

    @GetMapping("/menu")
    public String menu() {
        return "this is a menu";
    }


}
