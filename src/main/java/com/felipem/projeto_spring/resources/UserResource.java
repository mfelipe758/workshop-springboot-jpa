package com.felipem.projeto_spring.resources;

import com.felipem.projeto_spring.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "Maria", "Maria@gmail.com", "45646546", "dfdfd");
        return ResponseEntity.ok().body(u);
    }
}
