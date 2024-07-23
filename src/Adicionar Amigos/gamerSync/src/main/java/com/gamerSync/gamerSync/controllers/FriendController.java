package com.gamerSync.gamerSync.controllers;

import com.gamerSync.gamerSync.models.Friend;
import com.gamerSync.gamerSync.models.Users;
import com.gamerSync.gamerSync.services.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/friend")
@Validated
public class FriendController {

    @Autowired
    private FriendService userService;

    @GetMapping("/username/{username}")
    public ResponseEntity<Optional<Friend>> findByUsername(@PathVariable String username) {
        Optional<Friend> obj = this.userService.findByUsername(username);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping
    public ResponseEntity<List<Friend>> getAll() {
        List<Friend> users = userService.getAllUsers();
        return ResponseEntity.ok().body(users);
    }

    @PostMapping
    public ResponseEntity<Users> create(@Valid @RequestBody Friend obj) throws Exception {
        this.userService.createUser(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Users> update(@Valid @RequestBody Friend obj, @PathVariable Long id) {
        obj.setId(id);
        this.userService.updateUser(obj);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Users> delete(@PathVariable Long id) {
        this.userService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
