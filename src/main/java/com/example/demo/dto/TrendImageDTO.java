package com.example.demo.dto;

import com.example.demo.entity.TrendRecipe;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TrendImageDTO {
    private Long iNum;
    private String imgName;
    private String uuid;
    private String path;
    private TrendRecipeDTO trendRecipeDTO;
}
