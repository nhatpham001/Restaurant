package com.restaurant;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/homepage")
@CrossOrigin(origins = "http://localhost:3000")
public class HomepageController {
    @Autowired
    private HomepageService homepageService;
    @GetMapping
    public ResponseEntity<List<Homepage>> GetHomepage(){
        return new ResponseEntity<List<Homepage>>(homepageService.getAllHomePages(), HttpStatus.OK);
    }

}
