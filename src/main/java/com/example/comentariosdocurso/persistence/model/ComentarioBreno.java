package com.example.comentariosdocurso.persistence.model;

import jakarta.persistence.*;

@Entity
public class ComentarioBreno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "alunoBreno_id")
    private AlunoBreno alunoBreno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public AlunoBreno getAlunoBreno() {
        return alunoBreno;
    }

    public void setAlunoBreno(AlunoBreno alunoBreno) {
        this.alunoBreno = alunoBreno;
    }
}
