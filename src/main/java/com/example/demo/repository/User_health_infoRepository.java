package com.example.demo.repository;

import com.example.demo.entity.User_health_info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface User_health_infoRepository extends JpaRepository<User_health_info, Long>, QuerydslPredicateExecutor<User_health_info> {
}
