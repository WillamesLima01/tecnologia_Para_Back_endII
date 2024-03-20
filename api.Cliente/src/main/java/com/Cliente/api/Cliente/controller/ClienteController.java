package com.Cliente.api.Cliente.controller;

import com.Cliente.api.Cliente.model.Cliente;
import com.Cliente.api.Cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    ClienteService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Cliente> create(@RequestBody Cliente cliente) {
        Cliente clienteCreated = service.create(cliente);
        return ResponseEntity.status(201).body(clienteCreated);
    }

    @GetMapping("/all")
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> findall(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Cliente> findById(@PathVariable Long id){
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void Delete(@PathVariable Long id){
        service.delete(id);
    }

}
