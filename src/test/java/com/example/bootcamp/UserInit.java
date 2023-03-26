package com.example.bootcamp;

import com.example.bootcamp.dto.UserDtoWithFullName;
import com.example.bootcamp.model.entity.Users;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author : Volha Salash
 */

public final class UserInit {

    public static Users addUser() {
        return Users.builder()
                .firstName("Firsttestname")
                .lastName("Lasttestname")
                .patronymic("Patrtestname")
                .email("test" + ThreadLocalRandom.current().nextInt(10_000) + "@test.com")
                .build();
    }

    public static UserDtoWithFullName.UserDtoWithFullNameBuilder addUserDto() {
        return UserDtoWithFullName.builder()
                .lastName("Lasttestname")
                .firstName("Firsttestname")
                .patronymic("Patrtestname")
                .email("test1@test.com");
    }

}
