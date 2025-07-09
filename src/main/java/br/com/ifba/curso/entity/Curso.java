/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.entity;

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "curso") // Nome da tabela no banco de dados
public class Curso extends PersistenceEntity {

    @Column(name = "nome", nullable = false)
    private String nome;

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "codigo_curso")
    private boolean ativo = true; // Valor padrão

    @Column(name = "alunos_matriculados", nullable = false)
    private int alunosMatriculados;

    // Construtor padrão (obrigatório para JPA)
    public Curso() {
    }

    public Curso(String nome, Long id, boolean ativo, int alunosMatriculados) {
        this.nome = nome;
        this.id = id;
        this.ativo = ativo;
        this.alunosMatriculados = alunosMatriculados;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAlunosMatriculados() {
        return alunosMatriculados;
    }

    @Override
    public Long getId() {
        return this.id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setAlunosMatriculados(int alunos) {
        this.alunosMatriculados = alunos;
    }
}
