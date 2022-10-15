package com.farmily.farmilyback.data.dto;

import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDto<Type> {
    private String code;
    private String message;
    private Type data;
}
