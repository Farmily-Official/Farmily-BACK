package com.farmily.farmilyback.service;

import com.farmily.farmilyback.data.dto.UserDto;
import com.farmily.farmilyback.data.entity.User;
import com.farmily.farmilyback.data.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean checkUser(String email) {
        return userRepository.existsByEmail(email);
    }

    public UserDto.UserResponseDto findUser(String email) {
        User user =  userRepository.findByEmail(email);
        UserDto.UserResponseDto userDto = new UserDto.UserResponseDto();
        BeanUtils.copyProperties(user,userDto);
        return userDto;
    }

    public User register(UserDto.UserRequestDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto,user);
        //System.out.println(user.getUserName());
        return userRepository.save(user);
    }
}


