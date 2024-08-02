package com.example.demo.dto;

import com.example.demo.entity.Recipe_recommend;
import com.example.demo.entity.User;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
@Builder
@Data
public class Recipe_replyDTO {
    private int recipe_reply_num;
    private String recipe_reply_content;
    private User user;
    private Recipe_recommend recipeRecommend;
    private LocalDateTime regDate, modDate;
}
