package com.example.bootcamp.repository;

/**
 * @author : Volha Salash
 */

import com.example.bootcamp.BootcampApplication;
import com.example.bootcamp.model.entity.Users;
import com.example.bootcamp.model.repository.interfaces.RoleRepository;
import com.example.bootcamp.model.repository.interfaces.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@ExtendWith(SpringExtension.class)
@Transactional
@SpringBootTest(classes = BootcampApplication.class)
@DisplayName("User Repository test.")
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RoleRepository roleRepository;

    @Test
    @DisplayName("Save user.")
    void saveUser() {
        Users newUser = getUser();
        assertDoesNotThrow(() -> userRepository.save(newUser));
    }


    @Test
    @DisplayName("Find All users.")
    void testFindAll() {
        Users user = getUser();
        userRepository.save(user);
        List<Users> result = new ArrayList<>(userRepository.findAll());
        result.addAll(userRepository.findAll());
        assertNotEquals(userRepository.findAll().size(), result.size());
    }


    private Users getUser() {
        Users user = new Users();
        user.setLastName("Testlast");
        user.setFirstName("Testfirst");
        user.setPatronymic("Testpatronymic");
        user.setEmail("test@test.com");
        return user;
    }
}
