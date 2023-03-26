package com.example.bootcamp.service.impl;

import com.example.bootcamp.converterMapper.interfaces.UserMapper;
import com.example.bootcamp.dto.UserDtoWithFullName;
import com.example.bootcamp.dto.UserResponseDto;
import com.example.bootcamp.model.entity.Users;
import com.example.bootcamp.model.repository.interfaces.UserRepository;
import com.example.bootcamp.service.interfaces.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * @author : Volha Salash
 */
@Service
@Log4j2
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public String saveUser(UserDtoWithFullName userDto) {
        Users user = userRepository.save(userMapper.toEntity(userDto));
        log.info("Created new user " + " " + user.getLastName() + " " + user.getFirstName() + " " + user.getPatronymic());
        return user.getLastName();
    }

    @Override
    public Page<UserResponseDto> findAllUsers(Pageable pageable) {
        log.info("Created list of users with page size" + " " + pageable.getPageSize());
        return this.userRepository.findAll(pageable).map(userMapper::toDto);
    }

}