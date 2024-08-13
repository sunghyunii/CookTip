package com.example.demo.dto;

import com.example.demo.entity.Recipe_Ingredients;
import com.example.demo.entity.Trend_Ingredients;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.sql.Blob;
import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class IngredientsDTO {
    private long food_ingred_num;
    private String food_ingred_name;
    private String food_ingred_content;
    private int food_ingred_price;
    private String food_ingred_img;
    private List<Trend_Ingredients> trend_ingredientsList;
    private List<Recipe_Ingredients> recipe_ingredients;
}
