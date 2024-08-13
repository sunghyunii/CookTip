package com.example.demo.dto;

import lombok.*;
import java.time.LocalDateTime;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CommunityDTO {
    private Long com_num;

    private String com_category;

    private String com_title;

    private LocalDateTime com_time;

    private int com_readcount;

    private String com_content;

    private String user_id;
}
