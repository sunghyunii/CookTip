package com.example.demo.service;

import com.example.demo.dto.PageRequestDTO;
import com.example.demo.dto.PageResultDTO;
import com.example.demo.dto.RecipeDTO;
import com.example.demo.dto.RecipeImageDTO;
import com.example.demo.entity.Recipe;
import com.example.demo.entity.RecipeImage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public interface RecipeService {
    //목록
    PageResultDTO<RecipeDTO, Recipe> getList(PageRequestDTO requestDTO);

    Long regist(RecipeDTO dto);
    /*void modify(Recipe_recommendDTO dto);

    void remove(Long id); */

    RecipeDTO read(Long id);
   default Recipe dtoToEntity(RecipeDTO recipeDTO){

       Recipe recipe = Recipe.builder()
               .recipeId(recipeDTO.getRecipeId())
               .title(recipeDTO.getTitle())
               .level(recipeDTO.getLevel())
               .time(recipeDTO.getTime())
               .content(recipeDTO.getContent())
               .ingredients(recipeDTO.getIngredients())
               .build();
       return recipe;
   }
    default RecipeDTO entityToDto(Recipe recipe){

        //Map<String, Object> entityMap = new HashMap<>();
        RecipeDTO recipeDTO = RecipeDTO.builder()
                .recipeId(recipe.getRecipeId())
                .title(recipe.getTitle())
                .level(recipe.getLevel())
                .time(recipe.getTime())
                .content(recipe.getContent())
                .ingredients(recipe.getIngredients())
                .regDate(recipe.getRegDate())
                .modDate(recipe.getModDate())
                .build();

        return recipeDTO;
    }


}
