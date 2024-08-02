package com.example.demo.dto;

import com.example.demo.entity.Community_reply;
import com.example.demo.entity.User;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Data
public class CommunityDTO {

    private int com_num;
    private String com_category;
    private String com_title;
    private int com_readcount;
    private String com_content;
    private User user;
    private List<Community_reply> communityReplyList;
    private LocalDateTime regDate, modDate;
}
