
package com.example.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Blob;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Ingredients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ingredId;
    private String ingredName;
    private String ingredContent;
    private int ingredPrice;
    private String ingredImg;
    @OneToMany
    private List<IngredImage> ingredImage;

    public void changeName(String ingredName){
        this.ingredName=ingredName;
    }
    public void changeContent(String ingredContent){
        this.ingredContent=ingredContent;
    }
   public void changePrice(int ingredPrice){
       this.ingredPrice=ingredPrice;
    }
    public void changeImg(String ingredImg){
        this.ingredImg=ingredImg;
    }
}

