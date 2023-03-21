package com.example.bootcamp.converterMapper.interfaces;

import com.example.bootcamp.dto.UserDto;
import com.example.bootcamp.model.entity.Users;

/**
 * @author : Volha Salash
 */

public interface UserMapper {

    UserDto toDto(Users user);

    Users toEntity(UserDto userDto);
}