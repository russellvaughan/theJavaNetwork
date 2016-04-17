package com.example.java.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    public User() {}
    private String name;
    private String subscribedPosts = "";
    public Timeline timeline = new Timeline();
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

    protected List<String> getTimeline(){
        return timeline.getTimeline();
    }

    public String viewTimeline(User user){
        return timeline.view(user);
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
