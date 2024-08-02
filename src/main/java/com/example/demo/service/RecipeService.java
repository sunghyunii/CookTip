package com.example.demo.service;

import com.example.demo.dto.Recipe_recommendDTO;
import com.example.demo.entity.Recipe_recommend;

public interface RecipeService {
    Long regist(Recipe_recommendDTO dto);
    void modify(Recipe_recommendDTO dto);

    void remove(Long id);

    void read(Long id);

    default Recipe_recommend dtoToEntity(Recipe_recommendDTO dto){
        Recipe_recommend entity  = Recipe_recommend.builder()
                .recipe_num(dto.getRecipe_num())
                .recipe_category(dto.getRecipe_category())
                .recipe_title(dto.getRecipe_title())
                .recipe_readcount(dto.getRecipe_readcount())
                .recipe_content(dto.getRecipe_content())
                .build();
        return entity;
    }

    default Recipe_recommendDTO entityToDto(Recipe_recommend entity){
        Recipe_recommendDTO dto  = Recipe_recommendDTO.builder()
                .recipe_num(entity.getRecipe_num())
                .recipe_category(entity.getRecipe_category())
                .recipe_title(entity.getRecipe_title())
                .recipe_readcount(entity.getRecipe_readcount())
                .recipe_content(entity.getRecipe_content())
                .build();
        return dto;
    }





}
