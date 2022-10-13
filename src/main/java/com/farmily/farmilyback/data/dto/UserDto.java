package com.farmily.farmilyback.data.dto;

import lombok.*;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotEmpty;

@Data
public class UserDto {

    @NoArgsConstructor
    @Builder
    @AllArgsConstructor
    @Getter
    public static class UserFormDto {
        @NotEmpty(message = "닉네임을 입력해주세요")
        @Length(min = 1,max = 15, message = "닉네임은 15자 이하로 설정해주세요.")
        private String displayName;
    }

    @Getter
    @Setter
    @AllArgsConstructor
    @NoArgsConstructor
    public static class UserResponseDto {
        private Long id;
        private String username;
        private String displayName;
        private String email;
        private String profile_image;
    }

}
