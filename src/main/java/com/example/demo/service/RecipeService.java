package com.example.demo.service;

import com.example.demo.dto.PageRequestDTO;
import com.example.demo.dto.PageResultDTO;
import com.example.demo.dto.RecipeDTO;
import com.example.demo.dto.RecipeImageDTO;
import com.example.demo.entity.Recipe;
import com.example.demo.entity.RecipeImage;

import java.util.HashMap;
import java.util.Map;

public interface RecipeService {
    PageResultDTO<RecipeDTO, Recipe> getList(PageRequestDTO requestDTO);

    Long regist(RecipeDTO dto);
   /* void modify(Recipe_recommendDTO dto);

    void remove(Long id);

    void read(Long id);*/
   default Map<String, Object> dtoToEntity(RecipeDTO recipeDTO){

       Map<String, Object> entityMap = new HashMap<>();
       Recipe recipe = Recipe.builder()
               .recipeId(recipeDTO.getRecipeId())
               .category(recipeDTO.getCategory())
               .title(recipeDTO.getTitle())
               .level(recipeDTO.getLevel())
               .time(recipeDTO.getTime())
               .readcount(recipeDTO.getReadcount())
               .content(recipeDTO.getContent())
               .build();
       entityMap.put("recipe", recipe);

       RecipeImageDTO recipeImageDTO = recipeDTO.getRecipeImageDTO();
       if(recipeImageDTO!=null){
           RecipeImage recipeImage = RecipeImage.builder()
                   .imgName(recipeImageDTO.getImageURL())
                   .uuid(recipeImageDTO.getUuid())
                   .path(recipeImageDTO.getPath())
                   .recipe(recipe)
                   .build();
           entityMap.put("recipeImg", recipeImage);
       }

       return entityMap;
   }
    default RecipeDTO entityToDto(Recipe recipe){

        //Map<String, Object> entityMap = new HashMap<>();
        RecipeDTO recipeDTO = RecipeDTO.builder()
                .recipeId(recipe.getRecipeId())
                .category(recipe.getCategory())
                .title(recipe.getTitle())
                .level(recipe.getLevel())
                .time(recipe.getTime())
                .readcount(recipe.getReadcount())
                .content(recipe.getContent())
                .build();

        /*entityMap.put("recipeDTO", recipeDTO);

        RecipeImage recipeImage = recipe.getRecipeImage();
        if(recipeImage!=null){
            RecipeImageDTO recipeImageDTO = RecipeImageDTO.builder()
                    .imgName(recipeImage.getImageURL())
                    .uuid(recipeImage.getUuid())
                    .path(recipeImage.getPath())
                    .recipe(recipe)
                    .build();
            entityMap.put("recipeImg", recipeImage);
        }*/

        return recipeDTO;
    }


}
