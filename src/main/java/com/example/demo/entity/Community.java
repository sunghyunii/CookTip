package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Community {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long com_num;

    private String com_category;

    private String com_title;

    private LocalDateTime com_time;

    private int com_readcount;

    private String com_content;

    @Column(name = "USER_ID")
    private String user_id;









}
