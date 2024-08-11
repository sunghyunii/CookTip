package com.example.demo.dto;

import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data

public class User_health_infoDTO {
    private Long user_health_id;
    private Long user_id;
    private int age;
    private String height_and_weight;
    private String favoritFood;
    private String category;
    private String addendum;
    private String allergy;
    private String foodKeyword;
}
