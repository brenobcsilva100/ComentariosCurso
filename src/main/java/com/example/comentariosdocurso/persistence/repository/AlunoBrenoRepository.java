package com.example.comentariosdocurso.persistence.repository;

import com.example.comentariosdocurso.persistence.model.AlunoBreno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoBrenoRepository extends JpaRepository<AlunoBreno, Long> {
}
