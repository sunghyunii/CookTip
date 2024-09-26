package com.example.demo.dto;

import lombok.*;

import java.util.List;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class IngredientsDTO {
    private long ingredId;
    private String ingredName;
    private String ingredContent;
    private int ingredPrice;
    private String ingredImg;
    private List<IngredImageDTO> ingredImageDTO;
}
