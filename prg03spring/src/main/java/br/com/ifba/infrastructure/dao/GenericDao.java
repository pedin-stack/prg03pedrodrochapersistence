/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.infrastructure.dao;

/**
 *
 * @author Casa
 */
import br.com.ifba.infrastructure.entity.PersistenceEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class GenericDao<T extends PersistenceEntity> implements GenericDaoI<T> {

     @PersistenceContext
    protected  EntityManager em;

    @Override
    public T save(T entity) {   
        em.getTransaction().begin();
        em.persist(entity);//estou usando merge ao inves de persist pois merge consegue adicionar objetos que são detached
        em.getTransaction().commit();
       //em.close();
        return entity;
    }

    @Override
    public T update(T entity) {
    EntityTransaction tx = em.getTransaction();
    tx.begin();
    T managed = em.merge(entity);
    tx.commit();
    //em.close();
    return managed;// esta funçao é por que o hibernate não reconhece como já existente, ele pode acabar fazendo um insert em vez de um update.
}
 
    @Override
      public void delete(T entity) {
        EntityTransaction tx = em.getTransaction();
            tx.begin();
            T managedEntity = em.merge(entity); 
            em.remove(managedEntity);
            tx.commit();
           // em.close();
    }

    @Override
    public List<T> findAll() {
        return em.createQuery("FROM " + getTypeClass().getName()).getResultList();
    }

    @Override
    public T findById(Long id) {
        return em.find(getTypeClass(), id);
    }

    private Class<T> getTypeClass() { // retorna ao tipo atual da classe em execução
        return (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass())
                .getActualTypeArguments()[0];
    }
}