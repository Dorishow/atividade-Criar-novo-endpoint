package com.santander.banco811.service.impl;

import com.santander.banco811.dto.curso.CursoRequest;
import com.santander.banco811.dto.curso.CursoResponse;
import com.santander.banco811.model.Curso;
import com.santander.banco811.repository.CursoRepository;
import com.santander.banco811.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {

    @Autowired
    CursoRepository cursoRepository;

    @Override
    public CursoResponse create(CursoRequest cursoRequest) {
        Curso curso = new Curso(cursoRequest);
        CursoResponse cursoResponse = new CursoResponse(cursoRepository.save(curso));
        return cursoResponse;
    }
}
