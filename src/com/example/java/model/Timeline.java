package com.example.java.model;

import java.util.ArrayList;
import java.util.List;

public class Timeline {

    public List<String> timeline = new ArrayList<>();
    private String posts = "";

    public List<String> getTimeline(){
        return timeline;
    }

    public void add(String message){
        timeline.add(message);
    }

    public String view(User user){
        for (String message:user.getTimeline()) {
            posts += user.getName() + ": " + message + "\n";
        }
        return posts.trim();
    }
}
