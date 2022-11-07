package com.example.demo.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class imageObject {

    @Id @GeneratedValue
    private  Long id;

    private String filename;

    private String filepath;

    public imageObject(String filename, String filepath)
    {
        this.filename = filename;
        this.filepath = filepath;
    }

}
