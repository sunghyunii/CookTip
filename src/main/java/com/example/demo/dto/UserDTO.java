package com.example.demo.dto;

import com.example.demo.entity.*;
import lombok.Builder;
import lombok.Data;
import java.util.Date;
import java.util.List;

@Builder
@Data
public class UserDTO {

    private String user_id;
    private String user_pw;
    private String user_pw_q;
    private String user_pw_a;
    private String user_nick;
    private int user_number;
    private String user_name;
    private String user_gender;
    private int user_phone;
    private String user_address;
    private String user_email;
    private Date user_brith;
    private boolean user_auth;
    private List<Community> communityList;
    private List<Community_reply> communityReplyList;
    private User_health_info userHealthInfo;
    private List<Recipe_recommend> recipeRecommend;
    private List<Recipe_reply> recipeReplyList;
}
