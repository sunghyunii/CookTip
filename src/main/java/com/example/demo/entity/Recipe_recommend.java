package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter @Setter

public class Recipe_recommend extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int recipe_num;

    @Column(length = 100, nullable = false)
    private String recipe_category;

    @Column(length = 15, nullable = false)
    private String recipe_title;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private int recipe_readcount;
    private String recipe_content;

    @OneToMany(mappedBy = "Recipe_recommend")
    private List<Recipe_reply> recipeReplyList;
    @ManyToMany
    private List<Ingredients> ingredientsList;

    //레시피 이름 수정
    public void changeTitle(String title){
        recipe_title= title;
    }

    //레시피 내용 수정
    public void changeContnet(String content){
        recipe_content = content;
    }

}
