package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter @Setter
public class User {
    @Id
    private String user_id;

    @Column(length = 15, nullable = false)
    private String user_pw;

    @Column(length = 100, nullable = false)
    private String user_pw_q;

    @Column(length = 100, nullable = false)
    private String user_pw_a;

    @Column(length = 15, nullable = false)
    private String user_nick;

    @Column(length = 15, nullable = false)
    private int user_number;

    @Column(length = 10, nullable = false)
    private String user_name;

    @Column(length = 1, nullable = false)
    private String user_gender;

    @Column(length = 15, nullable = false)
    private int user_phone;

    @Column(length = 50)
    private String user_address;

    @Column(length = 50)
    private String user_email;

    private Date user_brith;

    @Column(length = 1, nullable = false)
    private boolean user_auth;

    //mappedBy = "주체 엔티티에서 외래키 관리하는 필드"
    //연관관계 주인만 외래키 관리(등록, 수정 등)
    //주인이 아니면 읽기만 가능
    @OneToMany
    private List<Community> communityList;

    @OneToMany
    private List<Community_reply> communityReplyList;

    @OneToOne
    private User_health_info userHealthInfo;

    @OneToMany
    private List<Recipe_recommend> recipeRecommend;

    @OneToMany
    private List<Recipe_reply> recipeReplyList;

}
