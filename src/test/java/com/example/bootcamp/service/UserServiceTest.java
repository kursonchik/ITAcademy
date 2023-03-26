package com.example.bootcamp.service;

/**
 * @author : Volha Salash
 */

import com.example.bootcamp.dto.UserDtoWithFullName;
import com.example.bootcamp.model.entity.Users;
import com.example.bootcamp.model.repository.interfaces.UserRepository;
import com.example.bootcamp.service.interfaces.UserService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Pageable;

import java.util.List;

import static com.example.bootcamp.UserInit.addUser;
import static com.example.bootcamp.UserInit.addUserDto;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@DisplayName("User Service test.")
class UserServiceTest {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;


    @Test
    @DisplayName("Save new user.")
    void testSaveUser() {
        UserDtoWithFullName newUser = addUserDto().build();
        String userId = assertDoesNotThrow(() -> userService.saveUser(newUser));
        assertNotNull(userId);
    }


    @Test
    @DisplayName("Find all users.")
    void testGetAllUsers() {
        List<Users> users = List.of(addUser());
        userRepository.saveAll(users);
        assertEquals(10, userService.findAllUsers(Pageable.ofSize(10)).getSize());
    }

}
