package com.example.java.model;

import java.util.ArrayList;
import java.util.List;

public class Subscription {

    public List<String> subscriptions = new ArrayList<>();
    private String subscribedPosts = "";

    public void add(User user){
        for (String message:user.getTimeline()) {
            subscriptions.add(user.getName() + ": " +  message);
        }
    }

    public List<String> list(){
        return  subscriptions;
    }

    public String view(){
        for (String message:subscriptions) {
            subscribedPosts += message + "\n";
        }
        return subscribedPosts.trim();
    }

}
