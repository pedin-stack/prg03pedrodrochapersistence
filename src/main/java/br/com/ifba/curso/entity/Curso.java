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
@Table(name = "cursos")
public class Curso extends PersistenceEntity {  // Mantém herança essencial

    @Column(name = "ativo", nullable = true)
    private boolean ativo;
    
    @Column(name = "nome", nullable = false)
    private String nome;
   
    @Column(name = "codigo_curso", nullable = false, unique = true)
    private String codigoCurso;

    public Curso(boolean ativo , String nome, String codigoCurso) {
        this.ativo = ativo;
        this.nome = nome;
        this.codigoCurso = codigoCurso;
    }

    public Curso() {
    }
    
    @Override
    public String toString() {
        return this.nome;
    }
    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean aitvo) {
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(String codigoCurso) {  // Tipo alterado para long
        this.codigoCurso = codigoCurso;
    }
}