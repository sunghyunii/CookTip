package com.example.demo.dto;

import com.example.demo.entity.Community;
import com.example.demo.entity.User;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Builder
@Data
public class Community_replyDTO {
    private int community_reply_num;
    private String community_reply_content;
    private User user;
    private Community community;
    private LocalDateTime regDate, medDate;
}
