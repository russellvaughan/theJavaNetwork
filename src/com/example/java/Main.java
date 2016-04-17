package com.example.java;

import com.example.java.model.Timeline;
import com.example.java.model.User;

import static org.junit.Assert.assertEquals;

public class Main {
    public static void main(String[] args) {
        String expected = "My first message\nMy second message";
        Timeline timeline = new Timeline();
        User nikesh = new User("Nikesh");
        User spike = new User("Spike");
        nikesh.publish("My first message");
        nikesh.publish("My second message");
        System.out.println(timeline.view(nikesh));
    }
}



