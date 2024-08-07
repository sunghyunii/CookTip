/*package com.example.demo.service;

import com.example.demo.entity.Recipe_recommend;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecipeServiceImpl implements RecipeService {
    //레시피 저장
    public Long regist(Recipe_recommend recipeRecommend){

    }
    //추천 레시피 목록 조회
    public List<Recipe_recommend> findAll(){
        return em.createQuery("select r from Recipe_recommend r", Recipe_recommend.class)
                .getResultList();
    }

    //검색 레시피 목록 조회
    public List<Recipe_recommend> searchRecipe(String title, String content){
        //Querydsl에서 JPA 쿼리를 생성하고 실행하는 데 사용
        JPAQueryFactory queryFactory = new JPQueryFactory(em);

        QRecipe_recommend recipe_recommend= QRecipe_recommend.recipe_recommend;
        // 여러 조건을 논리적으로 결합하기 위해
        ArrayBuilders.BooleanBuilder builder = new ArrayBuilders.BooleanBuilder();
        if(title != null && !title.isEmpty()){
            builder.and(recipe_recommend.recipe_title.containsIgnoreCase(title));
        }

        if(content != null && !content.isEmpty()) {
            builder.and(recipe_recommend.recipe_content.contatinsIgnoreCase);
        }
        //recipe_recommend 엔티티 대상으로 쿼리 실행 후 fetch 메서드를 통해 결과를 리스트로 반환
        return queryFactory.selectFrom(recipe_recommend).where(builder).fetch();
    }
}*/
