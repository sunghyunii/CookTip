package com.example.demo.repository;

import com.example.demo.entity.Recipe;
import com.example.demo.entity.RecipeImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface ImageRepository extends JpaRepository<RecipeImage, Long>, QuerydslPredicateExecutor<RecipeImage> {
}
