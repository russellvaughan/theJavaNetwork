package com.example.java;

import com.example.java.model.User;

public class Main {
    public static void main(String[] args) {
        User spike = new User("Spike");
        spike.publish("My first message");
        spike.publish("My second message");
        System.out.println(spike.timeline.get(1));
    }
}



