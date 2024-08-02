package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Blob;
import java.util.List;

@Entity
@Getter @Setter
public class Ingredients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int food_ingred_num;

    @Column(length = 15, nullable = false)
    private String food_ingred_name;

    @Column(length = 100, nullable = false)
    private String food_ingred_contnet;
    private Number food_ingred_price;
    private Blob food_ingred_img;
    @ManyToMany
    private List<TrendRecipe_recommend> trendRecipeRecommendList;

    @ManyToMany
    private List<Recipe_recommend> recipeRecommendList;
}
