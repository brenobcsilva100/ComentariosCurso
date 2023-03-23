package com.example.comentariosdocurso.persistence.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class ProfessorBreno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String materia;

    @JsonIgnore
    @OneToMany(mappedBy = "professorBreno")
    private List<AlunoBreno> alunoBreno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public List<AlunoBreno> getAlunoBreno() {
        return alunoBreno;
    }

    public void setAlunoBreno(List<AlunoBreno> alunoBreno) {
        this.alunoBreno = alunoBreno;
    }
}
