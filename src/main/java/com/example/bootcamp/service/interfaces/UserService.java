package com.example.bootcamp.service.interfaces;

import com.example.bootcamp.dto.UserDtoWithFullName;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author : Volha Salash
 */
public interface UserService {

    void save(UserDtoWithFullName userDto);
    Page<UserDtoWithFullName> findAll(Pageable pageable);

}