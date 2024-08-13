package com.example.demo.dto;

import com.example.demo.entity.Community;
import com.example.demo.entity.User;
import jakarta.persistence.ManyToOne;

public class Community_replyDTO {
    private Long com_reply_num;
    private Long com_num;
    private String com_reply_content;
    private User user;
    private Community community;
}
