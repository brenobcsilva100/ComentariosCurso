package com.example.comentariosdocurso.controller;

import com.example.comentariosdocurso.persistence.repository.ComentarioBrenoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComentarioBrenoController {

    private final ComentarioBrenoRepository comentarioBrenoRepository;

    public ComentarioBrenoController(ComentarioBrenoRepository comentarioBrenoRepository) {
        this.comentarioBrenoRepository = comentarioBrenoRepository;
    }


    @GetMapping("/mostrarComentarioBreno")
    private ResponseEntity<?> mostrarComentarios(){
        return new ResponseEntity<>(comentarioBrenoRepository.findAll(), HttpStatus.OK);
    }
}
