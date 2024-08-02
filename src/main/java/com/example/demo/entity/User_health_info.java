package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class User_health_info {
    @Id
    @JoinColumn(name = "user_id")
    @OneToOne
    private User user;

    @Column(length = 100)
    private String user_allergy;

    @Column(length = 100)
    private String user_add;
}
