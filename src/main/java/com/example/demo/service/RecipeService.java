package com.example.demo.service;

import com.example.demo.dto.PageRequestDTO;
import com.example.demo.dto.PageResultDTO;
import com.example.demo.dto.RecipeDTO;
import com.example.demo.entity.Recipe;
import org.springframework.web.multipart.MultipartFile;

public interface RecipeService {
    PageResultDTO<RecipeDTO, Recipe> getList(PageRequestDTO requestDTO);

    Long regist(RecipeDTO dto);
   /* void modify(Recipe_recommendDTO dto);

    void remove(Long id);

    void read(Long id);*/

    default Recipe dtoToEntity(RecipeDTO dto){
        Recipe entity  = Recipe.builder()
                .recipeId(dto.getRecipeId())
                .category(dto.getCategory())
                .title(dto.getTitle())
                .readcount(dto.getReadcount())
                .content(dto.getContent())
                .build();
        return entity;
    }

    default RecipeDTO entityToDto(Recipe entity){
        RecipeDTO dto  = RecipeDTO.builder()
                .recipeId(entity.getRecipeId())
                .category(entity.getCategory())
                .title(entity.getTitle())
                .readcount(entity.getReadcount())
                .content(entity.getContent())
                .build();
        return dto;
    }


}
