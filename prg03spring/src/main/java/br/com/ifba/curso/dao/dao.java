/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.dao;
import br.com.ifba.curso.entity.Curso;
import br.com.ifba.infrastructure.dao.GenericDao;
import jakarta.persistence.TypedQuery;
import java.util.List;
import org.springframework.stereotype.Repository;


@Repository
public class dao extends GenericDao<Curso> implements CursoDaoI {
//metodo especifico para curso
    @Override
    public List<Curso> findByName(String nome) {
        TypedQuery<Curso> query = em.createQuery(
            "SELECT c FROM Curso c WHERE LOWER(c.nome) LIKE LOWER(:nome)", Curso.class);
        query.setParameter("nome", "%" + nome + "%");
        return query.getResultList();
    }
}


