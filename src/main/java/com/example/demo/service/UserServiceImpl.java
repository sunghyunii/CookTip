package com.example.demo.service;


import com.example.demo.dto.UserDTO;
import com.example.demo.dto.User_health_infoDTO;
import com.example.demo.entity.User;
import com.example.demo.entity.User_health_info;
import com.example.demo.repository.UserRepository;
import com.example.demo.repository.User_health_infoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Log4j2
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository user_infoRepository;
    private final User_health_infoRepository health_infoRepository;

    //회원 정보 조회
    @Override
    public UserDTO userInfoRead(Long id) {
        Optional<User> result = user_infoRepository.findById(id);
        return result.isPresent() ? entityToDto(result.get()) : null;

    }
    //회원 쿡 정보 조회
    @Override
    public User_health_infoDTO cookInfoRead(Long id) {
        Optional<User_health_info> result = health_infoRepository.findById(id);
        return result.isPresent() ? entityToDto(result.get()) : null;

    }

    //회원 정보 수정
    @Override
    public void modify(UserDTO dto) {
        Optional<User> result = user_infoRepository.findById(dto.getUser_id());

        if (result.isPresent()) {
            User entity = result.get();
            entity.changeName(dto.getUser_name());
            entity.changeAddress(dto.getUser_address());
            entity.changePhone(dto.getUser_phone());
            entity.changeNumber(dto.getUser_number());
            entity.changeEmail(dto.getUser_email());

            user_infoRepository.save(entity);
        }

    }
    //회원 쿡 정보 수정
    @Override
    public void modify(User_health_infoDTO dto) {
        Optional<User_health_info> result = health_infoRepository.findById(dto.getUser_health_id());

        if (result.isPresent()) {
            User_health_info entity = result.get();
            entity.changeAge(dto.getAge());
            entity.changeHeight_and_weight(dto.getHeight_and_weight());
            entity.changefavoritFood(dto.getFavoritFood());
            entity.changeCategory(dto.getCategory());
            entity.changeAddendum(dto.getAddendum());
            entity.changeAllergy(dto.getAllergy());
            entity.changeFoodKeyword(dto.getFoodKeyword());

            health_infoRepository.save(entity);
        }

    }

}
