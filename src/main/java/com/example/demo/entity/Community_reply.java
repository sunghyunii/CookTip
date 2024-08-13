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

public class Community_reply {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long com_reply_num;

    private Long com_num;

    private String reply_id;

    private LocalDateTime com_reply_time;

    private String com_reply_content;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private Community community;
}
