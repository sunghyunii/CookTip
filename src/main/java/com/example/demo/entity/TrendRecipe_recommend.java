package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class TrendRecipe_recommend extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int trend_recipe_num;

    @Column(length = 10, nullable = false)
    private String trend_recipe_category;

    @Column(length = 15, nullable = false)
    private String trend_recipe_title;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private int trend_recipe_readcount;

    private String trend_recipe_content;

    @ManyToMany
    private List<Ingredients> ingredientsList;

    //레시피 이름 수정
    public void changeTitle(String title){
        trend_recipe_title= title;
    }
    //레시피 내용 수정
    public void changeContnet(String content){
        trend_recipe_content = content;
    }

}
