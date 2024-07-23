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

import com.gamerSync.gamerSync.models.Times;
import com.gamerSync.gamerSync.models.Times.CreateTime;
import com.gamerSync.gamerSync.models.Times.UpdateTime;
import com.gamerSync.gamerSync.services.TimeService;

@RestController
@RequestMapping("/times")
@Validated
public class TimeController {

    @Autowired
    private TimeService timeService;

    @GetMapping("/{idJogo}")
    public ResponseEntity<List<Times>> findByIdJogo(@PathVariable Integer idJogo) {
        List<Times> obj = this.timeService.findByIdJogo(idJogo);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    @Validated(CreateTime.class)
    public ResponseEntity<Void> create(@Valid @RequestBody Times obj) {
        this.timeService.create(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{idTimeDisp}").buildAndExpand(obj.getIdTimeDisp()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @PutMapping("/{idTimeDisp}")
    @Validated(UpdateTime.class)

    public ResponseEntity<Times> update(@Valid @RequestBody Times obj, @PathVariable Long idTimeDisp) {
        obj.setIdTimeDisp(idTimeDisp);
        this.timeService.update(obj);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{idTimeDisp}")
    public ResponseEntity<Void> delete(@PathVariable Long idTimeDisp) {
        this.timeService.delete(idTimeDisp);
        return ResponseEntity.noContent().build();
    }

}
