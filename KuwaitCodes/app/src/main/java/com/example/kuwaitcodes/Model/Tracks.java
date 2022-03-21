package com.example.kuwaitcodes.Model;

public class Tracks {
    private String title;
    private String description;
    private int imageReference;


    public Tracks(String title, String description, int imageReference) {
        this.title = title;
        this.description = description;
        this.imageReference = imageReference;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImageReference() {
        return imageReference;
    }
}
