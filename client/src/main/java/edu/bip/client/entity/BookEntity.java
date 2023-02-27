package edu.bip.client.entity;

import lombok.Data;

@Data
public class BookEntity {
    private Integer id;
    private String title;
    private String author;
    private String publishing;
    private String year;
    private String kind;
}
