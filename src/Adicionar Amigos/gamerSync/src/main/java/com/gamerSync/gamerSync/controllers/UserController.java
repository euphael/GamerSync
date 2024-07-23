package com.gamerSync.gamerSync.controllers;

import com.gamerSync.gamerSync.models.Users;
import com.gamerSync.gamerSync.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/user")
@Validated
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/username/{username}")
    public ResponseEntity<Users> findByUsername(@PathVariable String username) {
        Users obj = this.userService.findByUsername(username);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping
    public ResponseEntity<List<Users>> getAll() {
        List<Users> users = userService.getAllUsers();
        return ResponseEntity.ok().body(users);
    }

    @PostMapping
    public ResponseEntity<Users> create(@Valid @RequestBody Users obj) {
        this.userService.createUser(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Users> update(@Valid @RequestBody Users obj, @PathVariable Long id) {
        obj.setId(id);
        this.userService.updateUser(obj);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Users> delete(@PathVariable Long id) {
        this.userService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/indicators")
    public ResponseEntity<Long> countUsers() {
        Long count = this.userService.countUsers();
        return ResponseEntity.ok().body(count);
    }

}
