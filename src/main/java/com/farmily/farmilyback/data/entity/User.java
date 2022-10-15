package com.farmily.farmilyback.data.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;


@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    @Column(length = 15, nullable = false)
    private String userName;

    @Column(length = 15, nullable = false)
    private String displayName;

    @Column(length = 30, nullable = false)
    private String email;

    @Column(nullable = true)
    private String profile_image;
}
