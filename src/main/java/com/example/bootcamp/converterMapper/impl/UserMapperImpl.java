package com.example.bootcamp.converterMapper.impl;


import com.example.bootcamp.converterMapper.interfaces.RoleMapper;
import com.example.bootcamp.converterMapper.interfaces.UserMapper;
import com.example.bootcamp.dto.RoleDto;
import com.example.bootcamp.dto.UserDtoWithFullName;
import com.example.bootcamp.model.entity.Roles;
import com.example.bootcamp.model.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Component
public class UserMapperImpl implements UserMapper {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Users toEntity(UserDtoWithFullName userDto) {
        if (userDto == null) {
            return null;
        }

        Users userEntity = new Users();

        userEntity.setLastName(userDto.getLastName());
        userEntity.setFirstName(userDto.getFirstName());
        userEntity.setPatronymic(userDto.getPatronymic());
        userEntity.setEmail(userDto.getEmail());
        userEntity.setRoles(userDto.getRoles());

        return userEntity;
    }

    @Override
    public UserDtoWithFullName toDto(Users user) {
        if (user == null) {
            return null;
        }

        UserDtoWithFullName userDto = new UserDtoWithFullName();

        userDto.setLastName(user.getLastName());
        userDto.setFirstName(user.getFirstName());
        userDto.setPatronymic(user.getPatronymic());
        userDto.setEmail(user.getEmail());
        userDto.setRoles(user.getRoles());

        return userDto;
    }

    public Set<Roles> roleDtoSetToRoleEntitySet(Set<RoleDto> set) {
        if (set == null) {
            return Collections.emptySet();
        }

        Set<Roles> set1 = new HashSet<Roles>(Math.max((int) (set.size() / .75f) + 1, 16));
        for (RoleDto roleDto : set) {
            set1.add(roleMapper.toEntity(roleDto));
        }

        return set1;
    }

    public Set<RoleDto> roleEntitySetToRoleDtoSet(Set<Roles> set) {
        if (set == null) {
            return Collections.emptySet();
        }

        Set<RoleDto> set1 = new HashSet<RoleDto>(Math.max((int) (set.size() / .75f) + 1, 16));
        for (Roles roleEntity : set) {
            set1.add(roleMapper.toDto(roleEntity));
        }

        return set1;
    }
}