package com.example.bootcamp.service.impl;

import com.example.bootcamp.converterMapper.interfaces.UserMapper;
import com.example.bootcamp.dto.UserDtoWithFullName;
import com.example.bootcamp.model.entity.Users;
import com.example.bootcamp.model.repository.interfaces.UserRepository;
import com.example.bootcamp.service.interfaces.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    @Transactional
    public void save(UserDtoWithFullName userDto) {
        Users user = userMapper.toEntity(userDto);
        userRepository.save(user);
        log.info("Created new user " + user.getUsername());
    }


    @Override
    public Page<UserDtoWithFullName> findAll(Pageable pageable) {
        return this.userRepository.findAll(pageable).map(userMapper::toDto);
    }

}