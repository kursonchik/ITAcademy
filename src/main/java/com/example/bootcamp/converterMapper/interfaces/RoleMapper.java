package com.example.bootcamp.converterMapper.interfaces;

import com.example.bootcamp.dto.RoleDto;
import com.example.bootcamp.model.entity.Roles;

/**
 * @author : Volha Salash
 */


public interface RoleMapper {

    RoleDto toDto(Roles role);

    Roles toEntity(RoleDto roleDto);
}
