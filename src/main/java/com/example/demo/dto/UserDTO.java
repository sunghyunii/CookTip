package com.example.demo.dto;

import lombok.*;

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
    private User_health_infoDTO user_health_infoDTO;
}

