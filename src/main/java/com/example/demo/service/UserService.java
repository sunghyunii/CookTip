package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.dto.User_health_infoDTO;
import com.example.demo.entity.User;
import com.example.demo.entity.User_health_info;

public interface UserService {
    UserDTO userInfoRead(Long id);
    User_health_infoDTO cookInfoRead(Long id);
    public void modify(UserDTO dto);
    public void modify(User_health_infoDTO dto);
    default User dtoToEntity(UserDTO dto) {
                User entity = User.builder()
                .user_id(dto.getUser_id())
                .user_pw(dto.getUser_pw())
                .user_name(dto.getUser_name())
                .user_address(dto.getUser_address())
                .user_phone(dto.getUser_phone())
                .user_number(dto.getUser_number())
                .user_email(dto.getUser_email())
                .user_auth(dto.isUser_auth())
                .build();
        return entity;
    }

    default UserDTO entityToDto(User entity){

        UserDTO dto  = UserDTO.builder()
                .user_id(entity.getUser_id())
                .user_pw(entity.getUser_pw())
                .user_name(entity.getUser_name())
                .user_address(entity.getUser_address())
                .user_phone(entity.getUser_phone())
                .user_number(entity.getUser_number())
                .user_email(entity.getUser_email())
                .user_auth(entity.isUser_auth())
                .build();
        return dto;
    }

    default User_health_info dtoToEntity(User_health_infoDTO dto) {
        User_health_info entity = User_health_info.builder()
                .user_id(dto.getUser_id())
                .age(dto.getAge())
                .height_and_weight(dto.getHeight_and_weight())
                .favoritFood(dto.getFavoritFood())
                .category(dto.getCategory())
                .addendum(dto.getAddendum())
                .allergy(dto.getAllergy())
                .foodKeyword(dto.getFoodKeyword())
                .build();
        return entity;
    }

    default User_health_infoDTO entityToDto(User_health_info entity){

        User_health_infoDTO dto  = User_health_infoDTO.builder()
                .user_id(entity.getUser_id())
                .age(entity.getAge())
                .height_and_weight(entity.getHeight_and_weight())
                .favoritFood(entity.getFavoritFood())
                .category(entity.getCategory())
                .addendum(entity.getAddendum())
                .allergy(entity.getAllergy())
                .foodKeyword(entity.getFoodKeyword())
                .build();
        return dto;
    }

}
