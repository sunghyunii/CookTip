package com.example.demo.service;

import com.example.demo.dto.PageRequestDTO;
import com.example.demo.dto.PageResultDTO;
import com.example.demo.dto.Recipe_recommendDTO;
import com.example.demo.entity.Recipe_recommend;
import com.example.demo.repository.RecipeRepository;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.function.Function;

@Service
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository repository;
    //레시피 저장
    public Long regist(Recipe_recommend recipeRecommend){
        repository.save(recipeRecommend);

    }
    //추천 레시피 목록 조회
    PageResultDTO<Recipe_recommendDTO,Recipe_recommend> getList(PageRequestDTO requestDTO){
        Pageable pageable = requestDTO.getPageable(Sort.by("recipe_num").descending());
        Page<Recipe_recommend> result = repository.findAll(pageable);

        Function<Recipe_recommend, Recipe_recommendDTO> fn = (entity ->
                entityToDto(entity));
        return new PageResultDTO<>(result, fn);
    }

    //레시피 읽기
    @Override
    public Recipe_recommendDTO read(Long id) {
        return ;

    }

    //검색 레시피 목록 조회
    public List<Recipe_recommend> searchRecipe(String title, String content){

    }

    @Override
    public void modify(Recipe_recommendDTO dto) {

    }

    @Override
    public void remove(Long id) {

    }

}
