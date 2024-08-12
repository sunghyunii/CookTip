package com.example.demo.dto;

import lombok.*;

import java.sql.Blob;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class IngredientsDTO {
    private long food_ingred_num;
    private String food_ingred_name;
    private String food_ingred_content;
    private int food_ingred_price;
    private Blob food_ingred_img;
}
