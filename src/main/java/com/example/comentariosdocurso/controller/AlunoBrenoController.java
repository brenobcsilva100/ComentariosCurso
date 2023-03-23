package com.example.comentariosdocurso.controller;

import com.example.comentariosdocurso.persistence.repository.AlunoBrenoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoBrenoController {

    private final AlunoBrenoRepository alunoBrenoRepository;

    public AlunoBrenoController(AlunoBrenoRepository alunoBrenoRepository) {
        this.alunoBrenoRepository = alunoBrenoRepository;
    }

    @GetMapping("/mostrarAlunoBreno")
    private ResponseEntity<?> mostrarComentarios(){
        return new ResponseEntity<>(alunoBrenoRepository.findAll(), HttpStatus.OK);
    }
}
