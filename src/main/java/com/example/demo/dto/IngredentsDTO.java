package com.example.demo.dto;

import com.example.demo.entity.Recipe_recommend;
import com.example.demo.entity.TrendRecipe_recommend;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.sql.Blob;
import java.util.List;

@Builder
@Data
public class IngredentsDTO {
    private int food_ingred_num;
    private String food_ingred_name;
    private String food_ingred_contnet;
    private Number food_ingred_price;
    private Blob food_ingred_img;
    private List<TrendRecipe_recommend> trendRecipeRecommendList;
    private List<Recipe_recommend> recipeRecommendList;
}
