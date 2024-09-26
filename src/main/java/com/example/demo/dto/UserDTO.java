package com.example.demo.dto;

import com.example.demo.entity.*;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserDTO {
    private Long id;
    private String pw;
    private String name;
    private String address;
    private int phone;
    private int number;
    private String email;
    private boolean auth;
    private HealthInfoDTO healthInfoDTO;
    private List<RecipeDTO> recipeDTOList;
    private List<RecipeReplyDTO> recipeReplyDTOList;
    private List<CommunityDTO> communityDTOList;
    private List<CommunityReplyDTO> communityReplyDTOList;
}

