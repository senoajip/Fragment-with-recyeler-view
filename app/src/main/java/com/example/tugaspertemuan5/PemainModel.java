package com.example.tugaspertemuan5;

public class PemainModel {
    String name , tag , description;
    int image;
    public String getName() {
        return name;
    }
    public String getTag() {
        return tag;
    }
    public String getDescription() {
        return description;
    }
    public int getImage() {
        return image;
    }
    public PemainModel(String name, String tag, String description, int image) {
        this.name = name;
        this.tag = tag;
        this.description = description;
        this.image = image;
    }
}
