package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Blob;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Ingredients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long food_ingred_num;

    @OneToOne
    @JoinColumn(name="ingred_info")
    private String food_ingred_name;
    private String food_ingred_content;
    private int food_ingred_price;
    private Blob food_ingred_img;


    public Ingredients(int food_ingred_num, String food_ingred_name, String food_ingred_content, int food_ingred_price, Blob food_ingred_img) {
        this.food_ingred_num = food_ingred_num;
        this.food_ingred_name = food_ingred_name;
        this.food_ingred_content = food_ingred_content;
        this.food_ingred_price = food_ingred_price;
        this.food_ingred_img = food_ingred_img;
    }
    public void changeNum(int ingre_num){
        food_ingred_num=ingre_num;
    }
    public void changeName(String ingre_name){
        food_ingred_name=ingre_name;
    }
    public void changeContent(String ingre_content){
        food_ingred_content=ingre_content;
    }
    public void changePrice(int ingre_price){
        food_ingred_price=ingre_price;
    }
    public void changeImg(Blob ingre_img){
        food_ingred_img=ingre_img;
    }
}
