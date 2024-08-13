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

public class Community_reply extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long com_reply_num;

    private Long com_num;

    //private String reply_id;

    //private LocalDateTime com_reply_time;

    private String com_reply_content;

    @ManyToOne
    private User user;

    @ManyToOne
    private Community community;

    //댓글 내용 수정
    public void changeContent(String com_reply_content){
        this.com_reply_content=com_reply_content;
    }

}
