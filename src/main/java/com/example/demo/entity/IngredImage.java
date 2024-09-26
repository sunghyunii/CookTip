package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class IngredImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iNum;
    private String imgName;
    private String uuid;
    private String path;
    @ManyToOne
    private Ingredients ingredients;
}
