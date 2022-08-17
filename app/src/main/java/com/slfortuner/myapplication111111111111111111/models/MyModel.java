package com.slfortuner.myapplication111111111111111111.models;

public class MyModel {

    private int imageID;
    private String text1;
    private String text2;

    public MyModel(int imageID, String text1, String text2) {
        this.imageID = imageID;
        this.text1 = text1;
        this.text2 = text2;
    }

    public int getImageID() {
        return imageID;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }
}


