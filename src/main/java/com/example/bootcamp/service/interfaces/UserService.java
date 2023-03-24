package com.example.bootcamp.service.interfaces;

import com.example.bootcamp.dto.UserDtoWithFullName;
import com.example.bootcamp.dto.UserResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author : Volha Salash
 */
public interface UserService {

    String save(UserDtoWithFullName userDto);

    Page<UserResponseDto> findAll(Pageable pageable);

}