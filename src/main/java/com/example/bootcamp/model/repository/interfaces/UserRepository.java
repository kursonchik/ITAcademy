package com.example.bootcamp.model.repository.interfaces;

import com.example.bootcamp.model.entity.Users;
import org.springframework.stereotype.Repository;

/**
 * @author : Volha Salash
 */
@Repository
public interface UserRepository {
    Users findUserByUsername(String username);
    Users findUserByLastname(String lastname);
    Users findUserByFirstname(String firstname);
    Users findUserByPatronymic(String patronymic);
    Users findUserByEmail(String email);

    void addUser(Users user);
}