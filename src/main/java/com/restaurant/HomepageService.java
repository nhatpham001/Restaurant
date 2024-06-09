package com.restaurant;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomepageService {
    @Autowired
    private HomepageRepository homepageRepository;

    public List<Homepage> getAllHomePages() {
        return homepageRepository.findAll();
    }
}
