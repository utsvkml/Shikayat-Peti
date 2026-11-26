package com.utsav.kamal.Shikayat_Pati.commons;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@AllArgsConstructor
public abstract class CommonController<E,M,ID> {

    private final Services services;

    @GetMapping
    public ResponseEntity getAll(){
        return new ResponseEntity<>(services.getAll(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity create(@RequestBody M m){
        return new ResponseEntity(services.create(m),HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity getById(@PathVariable ID id){
        System.out.println("id");
        return new ResponseEntity(services.getById(id),HttpStatus.OK);
    }
}
