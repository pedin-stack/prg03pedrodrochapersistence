/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.Service;
import br.com.ifba.curso.exceptions.Exceptions;
import java.util.List;
import br.com.ifba.curso.dao.dao;
import br.com.ifba.curso.entity.Curso;
/**
 *
 * @author Casa
 */
public class CursoService implements CursoServiceI {
      private final dao cursoDao = new dao();
      Exceptions excecoes = new Exceptions();// injeção da clsse criada para uso de exceções

    @Override
    public Curso saveCurso(Curso curso)throws RuntimeException {
        
        if(excecoes.capsuleisNull(curso)){
        
            throw new RuntimeException ("Dados do curso não preenchidos");  
        
        }/* else if(excecoes.idisEqual(curso.getId())){
        
        throw new RuntimeException ("ID já existente em outro objeto"); 
            
        }  */else{
        
        return cursoDao.save(curso);
        }
    }

    @Override
    public Curso updateCurso(Curso curso)throws RuntimeException {
         if(excecoes.capsuleisNull(curso)){
        
            throw new RuntimeException ("Dados do curso não preenchidos");  
        
        }  else{
        
        return cursoDao.update(curso);
        }
    }

    @Override
    public void deleteCurso(Curso curso)throws RuntimeException {
        
        if(excecoes.capsuleisNull(curso)){
        
            throw new RuntimeException ("Dados do curso não preenchidos");  
        
        } else{
        
            cursoDao.delete(curso);
        
        }
        
    }

    @Override
    public List<Curso> getAllCursos()throws RuntimeException {
        return cursoDao.findAll();
    }

    @Override
    public Curso getCursoById(Long id)throws RuntimeException{
  
        return cursoDao.findById(id);
    }

    @Override
    public List<Curso> getCursoByName(String name)throws RuntimeException{
        return cursoDao.findByName(name);
    }
}
