/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.infrastructure.dao;

/**
 *
 * @author Casa
 */

import br.com.ifba.infrastructure.entity.PersistenceEntity;
import java.util.List;

//interface para crud

public interface GenericDaoI<T extends PersistenceEntity> {
    T save(T entity);
    T update(T entity);
    void delete(T entity);
    List<T> findAll();
    T findById(long id);
}