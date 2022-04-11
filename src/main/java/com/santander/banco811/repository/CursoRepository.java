package com.santander.banco811.repository;

import com.santander.banco811.dto.curso.CursoRequest;
import com.santander.banco811.dto.curso.CursoResponse;
import com.santander.banco811.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
