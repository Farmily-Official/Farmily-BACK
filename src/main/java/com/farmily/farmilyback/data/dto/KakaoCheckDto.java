package com.farmily.farmilyback.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class KakaoCheckDto {
    private boolean exist;
    private String email;
    private String name;
    private String profile_image;
}
