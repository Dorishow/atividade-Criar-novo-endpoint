package com.santander.banco811.service.impl;

import com.santander.banco811.dto.disciplina.DisciplinaRequest;
import com.santander.banco811.dto.disciplina.DisciplinaResponse;
import com.santander.banco811.model.Disciplina;
import com.santander.banco811.repository.DisciplinaRepository;
import com.santander.banco811.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DisciplinaServiceImpl implements DisciplinaService {

    @Autowired
    DisciplinaRepository disciplinaRepository;

    @Override
    public DisciplinaResponse create(DisciplinaRequest disciplinaRequest) {
        Disciplina disciplina = new Disciplina(disciplinaRequest);
        DisciplinaResponse disciplinaResponse = new DisciplinaResponse(disciplinaRepository.save(disciplina));
        return disciplinaResponse;
    }
}
