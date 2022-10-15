package com.farmily.farmilyback.controller;

import com.farmily.farmilyback.data.dto.ResponseDto;
import com.farmily.farmilyback.data.dto.UserDto;
import com.farmily.farmilyback.data.entity.User;
import com.farmily.farmilyback.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseDto<Object> login(@RequestBody UserDto.UserRequestDto userRequestDto) {
        String email = userRequestDto.getEmail();
        if (userService.checkUser(email)) {
            return ResponseDto.builder()
                    .code("201")
                    .message("로그인에 성공하였습니다. userId=" + userService.findUser(email).getId())
                    .build();
        } else {
            return ResponseDto.builder()
                    .code("401")
                    .message("로그인에 실패하였습니다")
                    .build();
        }
    }

    @PostMapping("/register")
    public ResponseDto<Object> register(@RequestBody UserDto.UserRequestDto userRequestDto) {
        if (userService.checkUser(userRequestDto.getEmail())) {
            return ResponseDto.builder()
                    .code("401")
                    .message("이미 가입된 이메일입니다.")
                    .build();
        }
        else {
            User registered = userService.register(userRequestDto);
            UserDto.UserResponseDto userResponseDto = new UserDto.UserResponseDto();
            BeanUtils.copyProperties(registered, userResponseDto);
            return ResponseDto.builder()
                    .code("201")
                    .data(userResponseDto)
                    .message("회원가입이 완료되었습니다!")
                    .build();
        }
    }

}
