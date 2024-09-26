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
    private Long comId;
    private String comTitle;
    private String comContent;
    @ManyToOne
    private User user;
    @OneToMany
    private List<CommunityReply> community_reply;

    //제목 수정
    public void changeComTitle(String comTitle){
        this.comTitle=comTitle;
    }

    //내용 수정
    public void changeContent(String comContent){
        this.comContent=comContent;
    }









}
