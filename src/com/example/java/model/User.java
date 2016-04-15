package com.example.java.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    public User() {}

    private String name;
    public List<String> timeline = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void publish(String message){
        timeline.add(message);
    }

    public String getName() {
        return name;
    }
}
