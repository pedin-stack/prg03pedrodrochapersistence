/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.curso.dao;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.infrastructure.dao.GenericDaoI;
import java.util.List;

//METODOS ESPECIFICOS
public interface CursoDaoI extends GenericDaoI<Curso> {
    List<Curso> findByName(String nome);
}

