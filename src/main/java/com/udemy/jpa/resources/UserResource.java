package com.udemy.jpa.resources;

import com.udemy.jpa.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll () {
        User u = new User(1L, "Maria", "maria@gmail.com", "11988008800", "123");
        return ResponseEntity.ok().body(u);
    }
}
