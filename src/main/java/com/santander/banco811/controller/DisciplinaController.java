package com.santander.banco811.controller;

import com.santander.banco811.dto.disciplina.DisciplinaRequest;
import com.santander.banco811.dto.disciplina.DisciplinaResponse;
import com.santander.banco811.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

    @Autowired
    DisciplinaService disciplinaService;

    @PostMapping
    DisciplinaResponse create(@RequestBody DisciplinaRequest disciplinaRequest){
        return disciplinaService.create(disciplinaRequest);
    }
}
