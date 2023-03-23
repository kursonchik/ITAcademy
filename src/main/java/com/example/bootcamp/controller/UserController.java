package com.example.bootcamp.controller;

import com.example.bootcamp.dto.UserDtoWithFullName;
import com.example.bootcamp.service.interfaces.UserService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Volha Salash
 */
@Log4j2
@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private final UserService userService;

    // get all users
    @GetMapping
    public String findAll (@PageableDefault(sort = "email", direction = Sort.Direction.ASC, size = 10) Pageable pageable) {
        Map<String, Object> returnMap = new HashMap<>();
        returnMap.put("List of users:", this.userService.findAll(pageable));

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(returnMap);
    }


    // create user
    @PostMapping
    public ResponseEntity createUser(@RequestBody UserDtoWithFullName createUserDto) {
        userService.save(createUserDto);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
/*
    @Override
    @GetMapping("/all")
    public List<UserDto> getUsers(Pageable pageable) {
        return userService.getALlUsers(pageable);
    }

    /*
        @GetMapping
        public Page<Users> getUsers(@PageableDefault(sort = "email",direction = Sort.Direction.ASC, size = 10) Pageable pageable) {
            return this.userRepository.findAll(pageable);
        }
     */
