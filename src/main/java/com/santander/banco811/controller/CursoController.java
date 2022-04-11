package com.santander.banco811.controller;

import com.santander.banco811.dto.curso.CursoRequest;
import com.santander.banco811.dto.curso.CursoResponse;
import com.santander.banco811.model.Curso;
import com.santander.banco811.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    CursoService cursoService;

    @PostMapping
    public CursoResponse create(@RequestBody CursoRequest cursoRequest) {
        return cursoService.create(cursoRequest);
    }
}
