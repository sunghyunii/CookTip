package com.example.demo.service;

import com.example.demo.dto.PageRequestDTO;
import com.example.demo.dto.PageResultDTO;
import com.example.demo.dto.RecipeDTO;
import com.example.demo.entity.Recipe;
import com.example.demo.repository.RecipeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
@Log4j2
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository repository;
    //추천 레시피 목록 조회
    public PageResultDTO<RecipeDTO, Recipe> getList(PageRequestDTO requestDTO){
        Pageable pageable = requestDTO.getPageable(Sort.by("recipeId").descending());
        Page<Recipe> result = repository.findAll(pageable);

        Function<Recipe, RecipeDTO> fn = (entity ->
                entityToDto(entity));
        return new PageResultDTO<>(result, fn);
    }

    @Override
    public Long regist(RecipeDTO dto) {
        Recipe entity = dtoToEntity(dto);
        repository.save(entity);

        return entity.getRecipeId();
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
