package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class User_health_info {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_health_id;

    @OneToOne
    @JoinColumn(name="user_id")
    private Long user_id;
    private int age;
    private String height_and_weight;
    private String favoritFood;
    private String category;
    private String addendum;
    private String allergy;
    private String foodKeyword;

    public void changeAge(int age) {
        this.age = age;
    }
    public void changeHeight_and_weight(String height_and_weight) {
        this.height_and_weight = height_and_weight;
    }
    public void changefavoritFood(String favoritFood) {
        this.favoritFood = favoritFood;
    }
    public void changeCategory(String category) {
        this.category = category;
    }
    public void changeAddendum(String addendum) {
        this.addendum = addendum;
    }
    public void changeAllergy(String allergy) {
        this.allergy = allergy;
    }
    public void changeFoodKeyword(String foodKeyword) {
        this.foodKeyword = foodKeyword;
    }
}
