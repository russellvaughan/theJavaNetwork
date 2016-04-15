package com.example.java.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    public User() {}
    private String name;
    private String posts = "";
    private String subscribedPosts = "";
    public List<String> timeline = new ArrayList<>();
    public List<String> subscriptions = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void publish(String message){
        timeline.add(message);
    }

    public String getName() {
        return name;
    }

    public List<String> getTimeline(){
        return timeline;
    }

    public String viewTimeline(User user){
        for (String message:user.getTimeline()) {
            posts += message + "\n";
        }
    return posts.trim();
    }

    public void subscribe(User user){
        for (String message:user.getTimeline()) {
            subscriptions.add(message);
        }
    }
    public String viewSubscriptions() {
        for (String message:subscriptions) {
            subscribedPosts += message + "\n";
        }
        return subscribedPosts.trim();
    }
}
