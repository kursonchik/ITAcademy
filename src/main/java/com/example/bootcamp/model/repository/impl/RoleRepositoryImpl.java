package com.example.bootcamp.model.repository.impl;

import com.example.bootcamp.model.entity.Roles;
import com.example.bootcamp.model.repository.interfaces.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

/**
 * @author : Volha Salash
 */

@Repository
public class RoleRepositoryImpl implements RoleRepository {

    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Roles findRoleByName(String name) {
        Roles role;
        try {
            role = (Roles) entityManager.createQuery("SELECT t FROM Roles t where t.name = :name")
                    .setParameter("Role name", name).getSingleResult();
        } catch (NoResultException e) {
            role = null;
        }
        return role;
    }
}
