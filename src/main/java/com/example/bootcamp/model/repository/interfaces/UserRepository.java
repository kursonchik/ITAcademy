package com.example.bootcamp.model.repository.interfaces;

import com.example.bootcamp.model.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : Volha Salash
 */
@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

}