/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.entity;
import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "curso") // Nome da tabela no banco de dados
public class Curso extends PersistenceEntity { 

    @Column(name = "nome", nullable = false)
    private String nome;
    
    @Id
    @Column(name = "codigo_curso", nullable = false, unique = true)
    private long codigoCurso;

    @Column(name = "ativo")
    private boolean ativo = true; // Valor padrão
    
    @Column(name = "alunos_matriculados" , nullable = false)
    private int alunosMatriculados;

    // Construtor padrão (obrigatório para JPA)
    public Curso() {
    }

    // Construtor com campos

    public Curso(String nome, long codigoCurso, boolean ativo , int alunosMatriculados) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
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

    public long getCodigoCurso() {
        return codigoCurso;
    }

    public int getAlunosMatriculados(){
    return alunosMatriculados;
    }
    
    public void setCodigoCurso(long codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    public void setAlunosMatriculados(int alunos){
        this.alunosMatriculados = alunos;
    }
}