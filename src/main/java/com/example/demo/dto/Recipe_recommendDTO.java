package com.example.demo.dto;

import com.example.demo.entity.Ingredients;
import com.example.demo.entity.Recipe_reply;
import com.example.demo.entity.User;
import lombok.Builder;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Builder
@Data
public class Recipe_recommendDTO {

    private int recipe_num;
    private String recipe_category;
    private String recipe_title;
    private User user;
    private int recipe_readcount;
    private String recipe_content;
    private List<Recipe_reply> recipeReplyList;
    private List<Ingredients> ingredientsList;
    private LocalDateTime regDate, modDate;
    //레시피 이름 수정
    public void changeTitle(String title){
        recipe_title= title;
    }
    //레시피 내용 수정
    public void changeContnet(String content){
        recipe_content = content;
    }


}
