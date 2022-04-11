package com.santander.banco811.dto.disciplina;

import com.santander.banco811.model.Curso;
import com.santander.banco811.model.Disciplina;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
public class DisciplinaResponse {
    private Integer id;
    private String nome;
    private String codigo;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;

    public DisciplinaResponse(Disciplina disciplina) {
        this.id = disciplina.getId();
        this.nome = disciplina.getNome();
        this.codigo = disciplina.getCodigo();
        this.dataCriacao = disciplina.getDataCriacao();
        this.dataAtualizacao = disciplina.getDataAtualizacao();
    }

    public static List<DisciplinaResponse> toResponse(List<Disciplina> disciplinas){
        return  disciplinas.stream().map(DisciplinaResponse::new).collect(Collectors.toList());
    }
}
