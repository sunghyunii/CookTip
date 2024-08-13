package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Community extends Timestamped{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long com_num;

    private String com_category;

    private String com_title;

    //private LocalDateTime com_time;

    private int com_readcount;

    private String com_content;

    @ManyToOne
    private User user;

    @OneToMany
    private List<Community_reply> community_reply;

    //카테고리 수정
    public void changeCategory(String com_category){
        this.com_category=com_category;
    }

    //제목 수정
    public void changeTitle(String com_title){
        this.com_title=com_title;
    }

    //내용 수정
    public void changeContent(String com_content){
        this.com_content=com_content;
    }









}
