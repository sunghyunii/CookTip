package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
public class Community_reply extends Timestamped {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int community_reply_num;

    @Column(length = 100, nullable = false)
    private String community_reply_content;
    @JoinColumn(name = "user_id")
    @ManyToOne
    private User user;
    @JoinColumn(name = "com_num")
    @ManyToOne
    private Community community;
}
