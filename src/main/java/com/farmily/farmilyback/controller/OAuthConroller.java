package com.farmily.farmilyback.controller;

import com.farmily.farmilyback.data.dto.KakaoCheckDto;
import com.farmily.farmilyback.data.dto.UserDto;
import com.farmily.farmilyback.service.OAuthService;
import com.farmily.farmilyback.service.UserService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.HashMap;

@RestController
@NoArgsConstructor
@RequestMapping("/auth")
public class OAuthConroller {
    OAuthService oAuth;

    @Autowired
    private UserService userService;

    @Autowired
    public OAuthConroller(OAuthService oAuthService) {
        oAuth = oAuthService;
    }

    @ResponseBody
    @ApiIgnore
    @GetMapping("/kakao/callback")
    public ResponseEntity<KakaoCheckDto> kakaoCallback(@RequestParam String code) {
        String token = oAuth.getKakaoAccessToken(code);
        HashMap<String, Object> userInfo = oAuth.getUserInfo(token);
        /*KakaoCheckDto kakaoCheckDto = new KakaoCheckDto();
        kakaoCheckDto.setName(userInfo.get("nickname").toString());
        kakaoCheckDto.setEmail(userInfo.get("email").toString());
        *//*kakaoCheckDto.setProfile_image(userInfo.get("thumbnail_image").toString());*//*
        kakaoCheckDto.setExist(userService.checkUser(userInfo.get("email").toString()));
        return ResponseEntity.status(HttpStatus.OK).body(kakaoCheckDto);*/
        System.out.println(userInfo);
        return null;
    }
}
