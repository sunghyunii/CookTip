package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Embeddable
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@ToString(exclude = "recipe") //연관 관계시 항상 주의
public class RecipeImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iNum;
    private String imgName;
    private String uuid;
    private String path;
    @ManyToOne(fetch=FetchType.LAZY)
    private Recipe recipe;
}
