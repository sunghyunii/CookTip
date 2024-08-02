package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Recipe_reply extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recipe_reply_num;

    private String recipe_reply_content;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "recipe_num")
    private Recipe_recommend recipeRecommend;


}
