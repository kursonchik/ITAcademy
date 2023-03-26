package com.example.bootcamp.controller.interfaces;

import com.example.bootcamp.dto.UserDtoWithFullName;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author : Volha Salash
 */

@RequestMapping("/api/users")
public interface UserAPIInterface {

    // get all users
    @GetMapping
    ResponseEntity<String> findAllUsers(@PageableDefault(sort = "email", direction = Sort.Direction.ASC, size = 10) Pageable pageable);

    // create user
    @PostMapping
    ResponseEntity<String> createUser(@RequestBody UserDtoWithFullName createUserDto);

}
