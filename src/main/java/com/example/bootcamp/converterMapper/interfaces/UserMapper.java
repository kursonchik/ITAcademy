package com.example.bootcamp.converterMapper.interfaces;

import com.example.bootcamp.dto.UserDtoWithFullName;
import com.example.bootcamp.dto.UserResponseDto;
import com.example.bootcamp.model.entity.Users;

/**
 * @author : Volha Salash
 */

public interface UserMapper {

    UserResponseDto toDto(Users user);

    Users toEntity(UserDtoWithFullName userDtoWithFullName);

}
