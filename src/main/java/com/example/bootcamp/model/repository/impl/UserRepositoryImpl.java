package com.example.bootcamp.model.repository.impl;
/*
import com.academy.model.entity.Users;
import com.academy.model.repository.interfaces.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
*/

import com.example.bootcamp.model.entity.Users;
import com.example.bootcamp.model.repository.interfaces.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;

/**
 * @author : Volha Salash
 */

@Repository
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Users findUserByUsername(String username) {
        Users user;
        try {
            user = (Users) entityManager.createQuery("SELECT t FROM Users t where t.username = :username")
                    .setParameter("username", username).getSingleResult();
        } catch (NoResultException e) {
            user = null;
        }
        return user;
    }

    @Override
    public Users findUserByLastname(String lastname) {
        Users user;
        try {
            user = (Users) entityManager.createQuery("SELECT t FROM Users t where t.lastname = :lastname")
                    .setParameter("lastname", lastname).getSingleResult();
        } catch (NoResultException e) {
            user = null;
        }
        return user;
    }

    @Override
    public Users findUserByFirstname(String firstname) {
        Users user;
        try {
            user = (Users) entityManager.createQuery("SELECT t FROM Users t where t.firstname = :firstname")
                    .setParameter("firstname", firstname).getSingleResult();
        } catch (NoResultException e) {
            user = null;
        }
        return user;
    }

    @Override
    public Users findUserByPatronymic(String patronymic) {
        Users user;
        try {
            user = (Users) entityManager.createQuery("SELECT t FROM Users t where t.patronymic = :patronymic")
                    .setParameter("patronymic", patronymic).getSingleResult();
        } catch (NoResultException e) {
            user = null;
        }
        return user;
    }

    @Override
    public Users findUserByEmail(String email) {
        Users user;
        try {
            user = (Users) entityManager.createQuery("SELECT t FROM Users t where t.email = :email")
                    .setParameter("email", email).getSingleResult();
        } catch (NoResultException e) {
            user = null;
        }
        return user;
    }

    @Override
    public void addUser(Users user) {
        entityManager.persist(user);
    }
}
