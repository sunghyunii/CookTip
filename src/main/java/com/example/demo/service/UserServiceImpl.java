
package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.dto.HealthInfoDTO;
import com.example.demo.entity.HealthInfo;
import com.example.demo.entity.User;
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
    public HealthInfoDTO cookInfoRead(Long id) {
        Optional<HealthInfo> result = health_infoRepository.findById(id);
        return result.isPresent() ? entityToDto(result.get()) : null;

    }

    //회원 정보 수정
    @Override
    public void modify(UserDTO dto) {
        Optional<User> result = user_infoRepository.findById(dto.getId());

        if (result.isPresent()) {
            User entity = result.get();
            entity.changeName(dto.getName());
            entity.changeAddress(dto.getAddress());
            entity.changePhone(dto.getPhone());
            entity.changeNumber(dto.getNumber());
            entity.changeEmail(dto.getEmail());

            user_infoRepository.save(entity);
        }

    }
    //회원 쿡 정보 수정
    @Override
   public void modify(HealthInfoDTO dto) {
        Optional<HealthInfo> result = health_infoRepository.findById(dto.getHealthInfoId());
        if (result.isPresent()) {
            HealthInfo entity = result.get();
            entity.changeAge(dto.getAge());
            entity.changeHeight_and_weight(dto.getHeight_and_weight());
            entity.changefavoritFood(dto.getFavoriteFood());
            entity.changeCategory(dto.getCategory());
            entity.changeAddendum(dto.getAddendum());
            entity.changeAllergy(dto.getAllergy());
            entity.changeFoodKeyword(dto.getFoodKeyword());

            health_infoRepository.save(entity);
        }
    }
}

