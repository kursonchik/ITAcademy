package com.example.bootcamp.model.repository.interfaces;

import com.example.bootcamp.model.entity.Roles;

/**
 * @author : Volha Salash
 */

public interface RoleRepository {
    Roles findRoleByName(String name);
}
