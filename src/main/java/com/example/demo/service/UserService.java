package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.dto.HealthInfoDTO;
import com.example.demo.entity.User;
import com.example.demo.entity.HealthInfo;

public interface UserService {
    UserDTO userInfoRead(Long id);
    HealthInfoDTO cookInfoRead(Long id);
    public void modify(UserDTO dto);
    public void modify(HealthInfoDTO dto);
    default User dtoToEntity(UserDTO dto) {
                User entity = User.builder()
                .id(dto.getId())
                .pw(dto.getPw())
                .name(dto.getName())
                .address(dto.getAddress())
                .phone(dto.getPhone())
                .number(dto.getNumber())
                .email(dto.getEmail())
                .auth(dto.isAuth())
                .build();
        return entity;
    }

    default UserDTO entityToDto(User entity){

        UserDTO dto  = UserDTO.builder()
                .id(entity.getId())
                .pw(entity.getPw())
                .name(entity.getName())
                .address(entity.getAddress())
                .phone(entity.getPhone())
                .number(entity.getNumber())
                .email(entity.getEmail())
                .auth(entity.isAuth())
                .build();
        return dto;
    }

    default HealthInfo dtoToEntity(HealthInfoDTO dto) {
        HealthInfo entity = HealthInfo.builder()
                .healthInfoId(dto.getHealthInfoId())
                .age(dto.getAge())
                .height_and_weight(dto.getHeight_and_weight())
                .favoriteFood(dto.getFavoriteFood())
                .category(dto.getCategory())
                .addendum(dto.getAddendum())
                .allergy(dto.getAllergy())
                .foodKeyword(dto.getFoodKeyword())
                .build();
        return entity;
    }

    default HealthInfoDTO entityToDto(HealthInfo entity){

        HealthInfoDTO dto  = HealthInfoDTO.builder()
                .healthInfoId(entity.getHealthInfoId())
                .age(entity.getAge())
                .height_and_weight(entity.getHeight_and_weight())
                .favoriteFood(entity.getFavoriteFood())
                .category(entity.getCategory())
                .addendum(entity.getAddendum())
                .allergy(entity.getAllergy())
                .foodKeyword(entity.getFoodKeyword())
                .build();
        return dto;
    }

}
