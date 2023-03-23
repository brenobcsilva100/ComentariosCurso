package com.example.comentariosdocurso.persistence.repository;

import com.example.comentariosdocurso.persistence.model.ComentarioBreno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioBrenoRepository extends JpaRepository<ComentarioBreno, Long> {
}
