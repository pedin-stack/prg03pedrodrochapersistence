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
import jakarta.persistence.Persistence;
import java.lang.reflect.ParameterizedType;
import java.util.List;

public class GenericDao<T extends PersistenceEntity> implements GenericDaoI<T> {

    protected static EntityManager em;

    static {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("gerenciamento_curso");
        em = factory.createEntityManager();
    }

    @Override
    public T save(T entity) {
        em.getTransaction().begin();
        em.persist(entity);
        em.getTransaction().commit();
        return entity;
    }

    @Override
    public T update(T entity) {
        em.getTransaction().begin();
        em.merge(entity);
        em.getTransaction().commit();
        return entity;
    }

    @Override
    public void delete(T entity) {
        entity = findById(entity.getId());
        em.getTransaction().begin();
        em.remove(entity);
        em.getTransaction().commit();
    }

    @Override
    public List<T> findAll() {
        return em.createQuery("FROM " + getTypeClass().getName()).getResultList();
    }

    @Override
    public T findById(long id) {
        return em.find(getTypeClass(), id);
    }

    private Class<T> getTypeClass() { // retorna ao tipo atual da classe em execução
        return (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass())
                .getActualTypeArguments()[0];
    }
}