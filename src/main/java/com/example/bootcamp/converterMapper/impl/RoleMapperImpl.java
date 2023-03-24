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
public class RoleMapperImpl implements RoleMapper {

    @Autowired
    private UserMapper userMapper;

    @Override
    public RoleDto toDto(Roles role) {
        if (role == null) {
            return null;
        }

        RoleDto roleDto = new RoleDto();

        roleDto.setName(role.getName());
        roleDto.setUsers(userEntitySetToUserDtoSet(role.getUsers()));

        return roleDto;
    }

    @Override
    public Roles toEntity(RoleDto roleDto) {
        if (roleDto == null) {
            return null;
        }

        Roles roleEntity = new Roles();

        roleEntity.setName(roleDto.getName());
        roleEntity.setUsers(userDtoSetToUserEntitySet(roleDto.getUsers()));

        return roleEntity;
    }

    public Set<UserDtoWithFullName> userEntitySetToUserDtoSet(Set<Users> set) {
        if (set == null) {
            return Collections.emptySet();
        }

        Set<UserDtoWithFullName> set1 = new HashSet<>(Math.max((int) (set.size() / .75f) + 1, 16));
        for (Users userEntity : set) {
    //        set1.add(userMapper.toDto(userEntity));
        }

       return set1;
    }

    protected Set<Users> userDtoSetToUserEntitySet(Set<UserDtoWithFullName> set) {
        if (set == null) {
            return Collections.emptySet();
        }

        Set<Users> set1 = new HashSet<>(Math.max((int) (set.size() / .75f) + 1, 16));
        for (UserDtoWithFullName userDtoList : set) {
            set1.add(userMapper.toEntity(userDtoList));
        }

        return set1;
    }
}