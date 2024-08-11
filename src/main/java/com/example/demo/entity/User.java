package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

    @Column(length = 15, nullable = false)
    private String user_pw;

    @Column(length = 15, nullable = false)
    private String user_name;

    @Column(length = 50, nullable = false)
    private String user_address;

    @Column(nullable = false)
    private int user_phone;

    @Column(nullable = false)
    private int user_number;

    @Column(length = 50)
    private String user_email;

    @Column(length = 1, nullable = false)
    private boolean user_auth;

    //mappedBy = "주체 엔티티에서 외래키 관리하는 필드"
    //연관관계 주인만 외래키 관리(등록, 수정 등)
    //주인이 아니면 읽기만 가능
    private User_health_info user_health_info;

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

