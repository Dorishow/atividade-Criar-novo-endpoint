package com.santander.banco811.service;

import com.santander.banco811.dto.disciplina.DisciplinaRequest;
import com.santander.banco811.dto.disciplina.DisciplinaResponse;

public interface DisciplinaService {
    DisciplinaResponse create(DisciplinaRequest disciplinaRequest);
}
