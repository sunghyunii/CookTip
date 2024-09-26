package com.example.demo.dto;

import lombok.*;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class RecipeImageDTO {
    private Long iNum;
    private String imgName;
    private String uuid;
    private String path;
    private RecipeDTO recipeDTO;
    public String getImageURL(){
        try{
            return URLEncoder.encode(path+"/"+uuid+"_"+imgName,"UTF-8");
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
        return "";
    }
    public String getThumbnailURL() {
        try {
            return URLEncoder.encode(path + "/s_" + uuid + "_" + imgName, "UTF-8");
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
        return "";

    }
}
