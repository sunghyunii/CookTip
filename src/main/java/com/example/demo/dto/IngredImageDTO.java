package com.example.demo.dto;

import com.example.demo.entity.Ingredients;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class IngredImageDTO {
    private Long iNum;
    private String imgName;
    private String uuid;
    private String path;
    private IngredientsDTO ingredientsDTO;

}
