package com.exemple.prototype.controller;

import com.exemple.prototype.model.User;
import com.exemple.prototype.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200") // Autorise Angular à communiquer avec Spring
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        // Sauvegarde l'utilisateur reçu dans la base de données
        return userRepository.save(user);
    }
}