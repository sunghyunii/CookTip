package com.example.demo.repository;

import com.example.demo.entity.Recipe_recommend;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import com.querydsl.jpa.impl.JPAQueryFactory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface RecipeRepository extends JpaRepository<Recipe_recommend, Long>, QuerydslPredicateExecutor<Recipe_recommend> {
}
