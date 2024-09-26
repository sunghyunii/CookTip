package com.example.demo.dto;

import com.example.demo.entity.CommunityReply;
import com.example.demo.entity.User;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommunityDTO {
    private Long comId;
    private String comTitle;
    private String comContent;
    private User user;
    private List<CommunityReplyDTO> communityReplyDTOList;
}
