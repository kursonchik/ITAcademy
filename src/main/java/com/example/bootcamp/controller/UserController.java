package com.example.bootcamp.controller;

import com.example.bootcamp.controller.interfaces.UserAPIInterface;
import com.example.bootcamp.dto.UserDtoWithFullName;
import com.example.bootcamp.service.interfaces.UserService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Volha Salash
 */

@RestController
@RequiredArgsConstructor
public class UserController implements UserAPIInterface {

    @Autowired
    private final UserService userService;

    // get all users
    @Override
    public ResponseEntity<String> findAllUsers(Pageable pageable) {
        try {
            Map<String, Object> returnMap = new HashMap<>();
            returnMap.put("List of users:", this.userService.findAllUsers(pageable));
            if (returnMap.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            return new ResponseEntity<>(gson.toJson(returnMap), HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    // create user
    @Override
    public ResponseEntity<String> createUser(@RequestBody UserDtoWithFullName createUserDto) {
        try {
            userService.saveUser(createUserDto);
            return ResponseEntity.status(HttpStatus.CREATED).body(userService.saveUser(createUserDto));
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}