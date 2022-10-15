package com.farmily.farmilyback.data.dto;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotEmpty;
public class UserDto {

    @Data
    @NoArgsConstructor
    @Builder
    @AllArgsConstructor
    @Getter
    public static class UserFormDto {
        @NotEmpty(message = "닉네임을 입력해주세요")
        @Length(min = 1,max = 15, message = "닉네임은 15자 이하로 설정해주세요.")
        private String displayName;
    }
    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UserResponseDto {
        private Long id;
        private String userName;
        private String displayName;
        private String email;
        private String profile_image;
    }

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UserRequestDto {
        private String email;
        private String userName;
        private String displayName;
        private String profile_image;
    }

}
