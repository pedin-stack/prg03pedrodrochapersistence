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
    public Curso save(Curso curso)throws RuntimeException {// nome,codigo,status e quantidades nao vazios e nao nulos 
        return cursoService.saveCurso(curso);
    }

    @Override
    public Curso update(Curso curso)throws RuntimeException {//deve haver ao menos um curso|  
        return cursoService.updateCurso(curso);
    }

    @Override
    public void delete(Curso curso)throws RuntimeException {
        cursoService.deleteCurso(curso);
    }

    @Override
    public List<Curso>findAll()throws RuntimeException {
        return cursoService.getAllCursos();
    }

    @Override
    public Curso findById(Long id)throws RuntimeException {
        return cursoService.getCursoById(id);
    }

    @Override
    public List<Curso> findByName(String name)throws RuntimeException {
        return cursoService.getCursoByName(name);
    }
    
}
