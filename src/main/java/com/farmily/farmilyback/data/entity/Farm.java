package com.farmily.farmilyback.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Farm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long farmId;

    @Column(nullable = false)
    private Long Qna;
}
