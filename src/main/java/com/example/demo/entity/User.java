package com.example.demo.entity;

import com.example.demo.dto.RecipeDTO;
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
    private Long id;
    private String pw;
    private String name;
    private String address;
    private int phone;
    private int number;
    private String email;
    private boolean auth;

    @OneToOne
    private HealthInfo healthInfo;
    @OneToMany
    private List<Recipe> recipeList;
    @OneToMany
    private List<RecipeReply> recipeReplyList;
    @OneToMany
    private List<Community> communityList;
    @OneToMany
    private List<CommunityReply> communityReplyList;


    //mappedBy = "주체 엔티티에서 외래키 관리하는 필드"
    //연관관계 주인만 외래키 관리(등록, 수정 등)
    //주인이 아니면 읽기만 가능

    public void changeName(String name) {
        this.name = name;
    }
    public void changeAddress(String address) {
        this.address = address;
    }
    public void changePhone(int phone) {
        this.phone = phone;
    }
    public void changeNumber(int number) {
        this.number = number;
    }
    public void changeEmail(String email) {this.email = email;}

}

