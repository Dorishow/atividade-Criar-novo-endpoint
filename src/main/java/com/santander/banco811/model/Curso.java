package com.santander.banco811.model;

import com.santander.banco811.dto.curso.CursoRequest;
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

@Table(name = "curso")
@Entity
@Getter  @Setter
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nome", nullable = false, unique = true)
    private String nome;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "data_criacao")
    @CreatedDate
    private LocalDateTime dataCriacao;

    @Column(name = "data_atualizacao")
    @LastModifiedDate
    private LocalDateTime dataAtualizacao;

    @OneToMany(mappedBy = "curso")
    List<Disciplina> disciplinas;

    public Curso(CursoRequest cursoRequest) {
        this.nome = cursoRequest.getNome();
        this.codigo = cursoRequest.getCodigo();
    }
}
