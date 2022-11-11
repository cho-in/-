package com.example.demo.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter @Setter
@NoArgsConstructor
public class ProductDto {

    private String title;

    private String content;

    private String filename;

    private String filepath;

    private int count;

    private int price;


}
