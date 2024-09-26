package com.example.demo.dto;

import com.example.demo.entity.User;
import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data

public class HealthInfoDTO {
    private Long healthInfoId;
    private UserDTO userDTO;
    private int age;
    private String height_and_weight;
    private String favoriteFood;
    private String category;
    private String addendum;
    private String allergy;
    private String foodKeyword;
}
