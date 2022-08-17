package com.slfortuner.myapplication111111111111111111.models;

public class DBModel {

    private String name;
    private String email;
    private String age;

    public DBModel(String name, String email, String age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAge() {
        return age;
    }
}
