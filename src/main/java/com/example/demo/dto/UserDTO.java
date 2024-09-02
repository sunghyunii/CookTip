package com.example.demo.dto;

import com.example.demo.entity.*;
import lombok.*;

import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {
    private Long user_id;
    private String user_pw;
    private String user_name;
    private String user_address;
    private int user_phone;
    private int user_number;
    private String user_email;
    private boolean user_auth;
    private User_health_info user_health_info;
    private List<Recipe> recipe_;
    private List<Recipe_replyDTO> recipe_reply;
    private List<Community> community;
    private List<Community_reply> community_reply;
}

