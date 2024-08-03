package com.example.demo.dto;

import com.example.demo.entity.Ingredients;
import com.example.demo.entity.User;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
@Builder
@Data
public class TrendRecipe_recommendDTO {
    private int trend_recipe_num;
    private String trend_recipe_category;
    private String trend_recipe_title;
    private String trend_recipe_img;
    private User user;
    private int trend_recipe_readcount;
    private String trend_recipe_content;
    private List<Ingredients> ingredientsList;
    private LocalDateTime regDate, modDate;

    //레시피 이름 수정
    public void changeTitle(String title){
        trend_recipe_title= title;
    }
    //레시피 내용 수정
    public void changeContnet(String content){
        trend_recipe_content = content;
    }

}
