package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter @Setter

public class Community extends Timestamped {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int com_num;

    @Column(length = 10, nullable = false)
    private String com_category;

    @Column(length = 50, nullable = false)
    private String com_title;
    private int com_readcount;
    private String com_content;
    @ManyToOne
    @JoinColumn(name ="user_id")
    private User user;

    //Community가 관계의 비주체 외래키는 Community_reply 에 저장.
    //=> community_reply는 반드시 community 랑 연결되어 있어야하기 떄문에
    //community_reply 는 외래키 칼럼을 가져야한다
    @OneToMany(mappedBy = "community")
    private List<Community_reply> communityReplyList;

}
