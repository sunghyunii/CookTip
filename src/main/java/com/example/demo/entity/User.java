package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @Id
    private Long user_id;

    private String user_pw;

    private String user_name;

    private String user_address;

    private int user_phone;

    private int user_number;

    private String user_email;

    private boolean user_auth;

    @OneToOne
    private User_health_info user_health_info;

    @OneToMany
    private List<Recipe> recipe_;

    @OneToMany
    private List<Recipe_reply> recipe_reply;

    @OneToMany
    private List<Community> community;

    @OneToMany
    private List<Community_reply> community_reply;


    //mappedBy = "주체 엔티티에서 외래키 관리하는 필드"
    //연관관계 주인만 외래키 관리(등록, 수정 등)
    //주인이 아니면 읽기만 가능

    public void changeName(String name) {
        user_name = name;
    }
    public void changeAddress(String address) {
        user_address = address;
    }
    public void changePhone(int phone) {
        user_phone = phone;
    }
    public void changeNumber(int Number) {
        user_number = Number;
    }
    public void changeEmail(String email) {user_email = email;
    }

}

