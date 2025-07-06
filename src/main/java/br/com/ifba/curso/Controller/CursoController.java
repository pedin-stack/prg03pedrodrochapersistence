/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.Controller;
import br.com.ifba.curso.entity.Curso;
import java.util.List;
import br.com.ifba.curso.Service.CursoService;
/**
 *
 * @author Casa
 */
public class CursoController implements CursoControllerI {
    
    private final CursoService cursoService = new CursoService();

    @Override
    public Curso saveCurso(Curso curso) {
        return cursoService.saveCurso(curso);
    }

    @Override
    public Curso updateCurso(Curso curso) {
        return cursoService.updateCurso(curso);
    }

    @Override
    public void deleteCurso(Curso curso) {
        cursoService.deleteCurso(curso);
    }

    @Override
    public List<Curso> getAllCursos() {
        return cursoService.getAllCursos();
    }

    @Override
    public Curso getCursoById(Long id) {
        return cursoService.getCursoById(id);
    }

    @Override
    public List<Curso> getCursoByName(String name) {
        return cursoService.getCursoByName(name);
    }
    
}
