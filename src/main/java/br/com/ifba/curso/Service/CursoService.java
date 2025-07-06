/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.Service;
import br.com.ifba.curso.entity.Curso;
import java.util.List;
import br.com.ifba.curso.dao.dao;
/**
 *
 * @author Casa
 */
public class CursoService implements CursoServiceI {
      private final dao cursoDao = new dao();

    @Override
    public Curso saveCurso(Curso curso) {
        return cursoDao.save(curso);
    }

    @Override
    public Curso updateCurso(Curso curso) {
        return cursoDao.update(curso);
    }

    @Override
    public void deleteCurso(Curso curso) {
        cursoDao.delete(curso);
    }

    @Override
    public List<Curso> getAllCursos() {
        return cursoDao.findAll();
    }

    @Override
    public Curso getCursoById(Long id) {
        return cursoDao.findById(id);
    }

    @Override
    public List<Curso> getCursoByName(String name) {
        return cursoDao.findByName(name);
    }
}
