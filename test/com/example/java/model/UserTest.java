package com.example.java.model;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void userHasAName() {
    String expected = "Spike";
    User spike = new User("Spike");
    assertEquals(spike.getName(), expected);
    }

    @Test
    public void userPublishesAMessage(){
        String expected = "My first message";
        User spike = new User("Spike");
        spike.publish("My first message");
        assertEquals(spike.timeline.get(0), expected);

    }
    @Test
    public void userPublishesMultipleMessage(){
        String expected = "My second message";
        User spike = new User("Spike");
        spike.publish("My first message");
        spike.publish("My second message");
        assertEquals(spike.timeline.get(1), expected);

    }

}