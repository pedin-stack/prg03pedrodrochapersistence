/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.entity;
import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "curso") // Nome da tabela no banco de dados
public class Curso extends PersistenceEntity { 

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "codigo_curso", nullable = false, unique = true)
    private String codigoCurso;

    @Column(name = "ativo")
    private boolean ativo = true; // Valor padrão

    // Construtor padrão (obrigatório para JPA)
    public Curso() {
    }

    // Construtor com campos
    public Curso(String nome, String codigoCurso, boolean ativo) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.ativo = ativo;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}