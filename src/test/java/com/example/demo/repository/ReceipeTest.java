package com.example.demo.repository;

import com.example.demo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

//@AllArgsConstructor
@SpringBootTest
public class ReceipeTest {

    @Autowired
    private  UserRepository userRepository;

    @Test
    public void insertUser(){
        IntStream.rangeClosed(1,300).forEach(i -> {

            User user = User.builder()
                    .user_pw("password...." + i)
                    .user_address("Content..." +i)
                    .user_phone(i)
                    .user_name("name..." +i)
                    .user_email("email..." +i)
                    .user_number(i)
                    .user_auth(true)
                    .build();
            System.out.println(userRepository.save(user));
        });

    }@Test
    public void insertRecipes(){
        IntStream.rangeClosed(1,300).forEach(i -> {
        Long user_id = (long)((Math.random() * 300));
            User user = User.builder()
                    .user_id(user_id)
                    .build();
           Recipe recipe = Recipe.builder()
                   .recipe_id(user_id)
                   .title("title...." + i)

                   .content("content...." + i)
                   .level("i")
                   .ingedients()

                    .build();
            System.out.println(userRepository.save(user));
        });
    }


}
