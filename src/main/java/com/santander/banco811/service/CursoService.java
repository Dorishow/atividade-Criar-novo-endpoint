package com.santander.banco811.service;

import com.santander.banco811.dto.curso.CursoRequest;
import com.santander.banco811.dto.curso.CursoResponse;
import com.santander.banco811.model.Curso;

import java.util.List;

public interface CursoService {
    CursoResponse create(CursoRequest cursoRequest);
}
