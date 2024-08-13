package com.example.demo.dto;

import com.example.demo.entity.Community_reply;
import com.example.demo.entity.User;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommunityDTO {
    private Long com_num;
    private String com_category;
    private String com_title;
    private int com_readcount;
    private String com_content;
    private User user;
    private List<Community_reply> community_reply;
}
