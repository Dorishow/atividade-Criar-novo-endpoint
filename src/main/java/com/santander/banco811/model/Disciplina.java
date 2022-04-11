package com.santander.banco811.model;

import com.santander.banco811.dto.curso.CursoRequest;
import com.santander.banco811.dto.disciplina.DisciplinaRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Table(name = "disciplina")
@Entity
@Getter  @Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Disciplina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome", nullable = false, unique = true)
    private String nome;

    @Column(name = "codigo", nullable = false, unique = true)
    private String codigo;

    @Column(name = "data_criacao", nullable = false)
    @CreatedDate
    private LocalDateTime dataCriacao;

    @Column(name = "data_atualizacao", nullable = false)
    @LastModifiedDate
    private LocalDateTime dataAtualizacao;

    @OneToMany(mappedBy = "disciplina")
    List<Curso> cursos;

    public Disciplina(DisciplinaRequest disciplina) {
        this.nome = disciplina.getNome();
        this.nome = disciplina.getCodigo();
    }
}
