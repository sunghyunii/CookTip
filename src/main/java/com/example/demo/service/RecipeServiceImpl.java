package com.example.demo.service;

import com.example.demo.dto.PageRequestDTO;
import com.example.demo.dto.PageResultDTO;
import com.example.demo.dto.RecipeDTO;
import com.example.demo.entity.Recipe;
import com.example.demo.entity.RecipeImage;
import com.example.demo.repository.ImageRepository;
import com.example.demo.repository.RecipeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.function.Function;

@Service
@Log4j2
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;
    private final ImageRepository imageRepository;
    //추천 레시피 목록 조회
    public PageResultDTO<RecipeDTO, Recipe> getList(PageRequestDTO requestDTO){
        Pageable pageable = requestDTO.getPageable(Sort.by("recipeId").descending());
        Page<Recipe> result = recipeRepository.findAll(pageable);

        Function<Recipe, RecipeDTO> fn = (entity ->
                entityToDto(entity));
        return new PageResultDTO<>(result, fn);
    }

    //레시피 등록
    @Override
    public Long regist(RecipeDTO recipeDTOto) {
        Map<String, Object> entityMap = dtoToEntity(recipeDTOto);
        Recipe recipe = (Recipe)entityMap.get("recipe");
        RecipeImage recipeImage = (RecipeImage)entityMap.get("recipeImg");
        recipeRepository.save(recipe);
        imageRepository.save(recipeImage);

        return recipe.getRecipeId();
    }

    //레시피 읽기
  /*  @Override
    public void read(Long id) {


    }

    //검색 레시피 목록 조회
    public List<Recipe_recommend> searchRecipe(String title, String content){

    }

    @Override
    public void modify(Recipe_recommendDTO dto) {

    }

    @Override
    public void remove(Long id) {

    }*/

}
