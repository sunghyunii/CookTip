package com.example.demo.repository;

import com.example.demo.entity.HealthInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface User_health_infoRepository extends JpaRepository<HealthInfo, Long>, QuerydslPredicateExecutor<HealthInfo> {
}
