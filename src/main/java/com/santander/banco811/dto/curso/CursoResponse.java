package com.santander.banco811.dto.curso;

import com.santander.banco811.model.Curso;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
public class CursoResponse {
    private Integer id;
    private String nome;
    private String codigo;
    private LocalDateTime dataCriacao;
    private LocalDateTime dataAtualizacao;

    public CursoResponse(Curso curso) {
        this.id = curso.getId();
        this.nome = curso.getNome();
        this.codigo = curso.getCodigo();
        this.dataCriacao = curso.getDataCriacao();
        this.dataAtualizacao = curso.getDataAtualizacao();
    }

    public static List<CursoResponse> toResponse(List<Curso> cursos){
        return  cursos.stream().map(CursoResponse::new).collect(Collectors.toList());
    }
}
