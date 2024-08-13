package com.example.demo.dto;

import com.example.demo.entity.User;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data

public class User_health_infoDTO {
    private Long user_health_id;
    private User user;
    private int age;
    private String height_and_weight;
    private String favoritFood;
    private String category;
    private String addendum;
    private String allergy;
    private String foodKeyword;
}
