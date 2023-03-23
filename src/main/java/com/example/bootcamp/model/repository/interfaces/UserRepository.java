package com.example.bootcamp.model.repository.interfaces;

import com.example.bootcamp.dto.UserDtoWithFullName;
import com.example.bootcamp.model.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author : Volha Salash
 */
@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    void save (UserDtoWithFullName userDto);
    List<Users> findAll();
}