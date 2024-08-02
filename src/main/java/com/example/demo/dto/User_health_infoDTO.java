package com.example.demo.dto;

import com.example.demo.entity.User;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class User_health_infoDTO {
    private User user;
    private String user_allergy;
    private String user_add;
}
