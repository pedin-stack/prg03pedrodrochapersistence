/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.entity;
import jakarta.persistence.*;
/**
 *
 * @author Casa
 */
@Entity
@Table(name = "cursos")
public class Curso {
    
    @Column (name = "qtd_alunos",nullable = true)
    private int quantidadeAlunos;
    
    @Column(name = "nome", nullable = false)
    private String nome;
    
    @Id
    @Column(name = "codigo_curso", nullable = false, unique = true)
    private int codigoCurso;

    public Curso(String nome, int quantidadeAlunos, int codigoCurso) {
        this.quantidadeAlunos = quantidadeAlunos;
        this.nome = nome;
        this.codigoCurso = codigoCurso;
    }

    @Override
    public String toString() {
        return this.nome;
    }

    public int getQuantidadeAlunos() {
        return quantidadeAlunos;
    }

    public void setQuantidadeAlunos(int quantidadeAlunos) {
        this.quantidadeAlunos = quantidadeAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }
     
 
    
}
