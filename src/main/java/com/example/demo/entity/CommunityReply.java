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

public class CommunityReply extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comReplyId;
    //private LocalDateTime com_reply_time;
    private String comReplyContent;
    @ManyToOne
    private User user;
    @ManyToOne
    private Community community;

    //댓글 내용 수정
    public void changeContent(String comReplyContent){
        this.comReplyContent=comReplyContent;
    }

}
