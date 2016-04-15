package com.example.java.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void userHasAName() {
    String expected = "Spike";
    User spike = new User("Spike");
    assertEquals(expected, spike.getName());
    }

    @Test
    public void userPublishesAMessage(){
        String expected = "My first message";
        User spike = new User("Spike");
        spike.publish("My first message");
        assertEquals(expected, spike.timeline.get(0));

    }
    @Test
    public void userPublishesMultipleMessage(){
        String expected = "My second message";
        User spike = new User("Spike");
        spike.publish("My first message");
        spike.publish("My second message");
        assertEquals(expected, spike.timeline.get(1));

    }

    @Test
    public void userCanViewOtherUsersTimeline(){
        List<String> expected = Arrays.asList("My first message", "My second message");
        User spike = new User("Spike");
        spike.publish("My first message");
        spike.publish("My second message");
        assertEquals(expected, spike.getTimeline() );

    }


}