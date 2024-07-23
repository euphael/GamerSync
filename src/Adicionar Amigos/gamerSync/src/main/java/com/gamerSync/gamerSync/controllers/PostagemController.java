package com.gamerSync.gamerSync.controllers;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.gamerSync.gamerSync.models.Postagem;
import com.gamerSync.gamerSync.services.PostagemService;

@RestController
@RequestMapping("/postagem")
@Validated
public class PostagemController {

    @Autowired
    private PostagemService PostagemService;

    @GetMapping
public ResponseEntity<List<Postagem>> getAllPostagens() {
    List<Postagem> postagens = this.PostagemService.getAllPostagens();
    return ResponseEntity.ok().body(postagens);
}

    @GetMapping("/{id}")
    public ResponseEntity<Postagem> findById(@PathVariable Long id) {
        Postagem obj = this.PostagemService.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    @Validated
    public ResponseEntity<Void> create( @Valid @RequestBody Postagem obj){
        this.PostagemService.create(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();

        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@Valid @RequestBody Postagem obj, @PathVariable Long id) {
        obj.setId(id);
        this.PostagemService.update(obj);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        this.PostagemService.delete(id);
        return ResponseEntity.noContent().build();
    }
}