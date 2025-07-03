/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.curso.dao;

import br.com.ifba.curso.entity.Curso;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.EntityManagerFactory; 
import jakarta.persistence.Persistence;
import java.util.List;
/*
 public class DAO {
    private static EntityManagerFactory emf;//para não chmar toda hora :Persistence.createEntityManagerFactory("gerenciamento_curso") instancio essa variavel   

    static {
        emf = Persistence.createEntityManagerFactory("gerenciamento_curso");
    }

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    //Adicionar novo curso
    public void save(Curso curso) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        //tratamento de exceções
        
        try {
            tx.begin();
            em.persist(curso);
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) tx.rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    //Buscar curso por ID
    public Curso findById(Long id) {
        EntityManager em = getEntityManager();
        
         //tratamento de exceções
        
        try {
            return em.find(Curso.class, id);
        } finally {
            em.close();
        }
    }

    //listar todos os cursos [usar para 'preencher' a tabela toda vez que iniciar o programa]
    public List<Curso> findAll() {
        EntityManager em = getEntityManager();
        
         //tratamento de exceções
        
        try {
            TypedQuery<Curso> query = em.createQuery("SELECT c FROM Curso c", Curso.class);
            return query.getResultList();
        } finally {
            em.close();
        }
    }

    //atualizar curso
    public void update(Curso curso) {
           EntityManager em = getEntityManager();
    EntityTransaction tx = em.getTransaction();

    try {
        tx.begin();

        //procuara peloo curso atual do banco
        Curso cursoExistente = em.find(Curso.class, curso.getCodigoCurso());

        if (cursoExistente != null) {//se não fizer essa verificação há o risco do hibernate criar um novo item no DB com o item editado
            cursoExistente.setNome(curso.getNome());
            cursoExistente.setCodigoCurso(curso.getCodigoCurso());
            cursoExistente.setQuantidadeAlunos(curso.getQuantidadeAlunos());
        }

        tx.commit();
    } catch (Exception e) {
        if (tx.isActive()) tx.rollback();
        throw e;
    } finally {
        em.close();
    }
    }

    //remover curso
    public void delete(int id) {
        EntityManager em = getEntityManager();
        EntityTransaction tx = em.getTransaction();
        
         //tratamento de exceções
        
        try {
            tx.begin();
            Curso curso = em.find(Curso.class, id);
            if (curso != null) {
                em.remove(curso);
            }
            tx.commit();
        } catch (Exception e) {
            if (tx != null && tx.isActive()) tx.rollback();
            throw e;
        } finally {
            em.close();
        }
    }

    // Pesquisar por nome
    public List<Curso> findByName(String nome) {
        EntityManager em = getEntityManager();
        try {
            TypedQuery<Curso> query = em.createQuery(
                "SELECT c FROM Curso c WHERE LOWER(c.nome) LIKE LOWER(:nome)", Curso.class);
            query.setParameter("nome", "%" + nome + "%");
            return query.getResultList();
        } finally {
            em.close();
        }
    }
 }
  
  */
  
  import br.com.ifba.curso.entity.Curso;
import br.com.ifba.infrastructure.dao.GenericDao;

import br.com.ifba.curso.entity.Curso;
import br.com.ifba.infrastructure.dao.GenericDao;
import jakarta.persistence.TypedQuery;
import java.util.List;

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


