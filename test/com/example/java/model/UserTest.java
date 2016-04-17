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
        assertEquals(expected, spike.timeline.timeline.get(0));

    }
    @Test
    public void userPublishesMultipleMessage(){
        String expected = "My second message";
        User spike = new User("Spike");
        spike.publish("My first message");
        spike.publish("My second message");
        assertEquals(expected, spike.timeline.timeline.get(1));

    }

    @Test
    public void userCanViewTimeline(){
        List<String> expected = Arrays.asList("My first message", "My second message");
        User spike = new User("Spike");
        spike.publish("My first message");
        spike.publish("My second message");
        assertEquals(expected, spike.getTimeline() );

    }

    @Test
    public void userCanViewOtherUsersTimeline(){
        String expected = "My first message\nMy second message";
        User nikesh = new User("Nikesh");
        User spike = new User("Spike");
        nikesh.publish("My first message");
        nikesh.publish("My second message");
        assertEquals(expected, spike.viewTimeline(nikesh) );

    }

    @Test
    public void userCanSubscribeToOtherUsersTimelines() {
        List<String> expected = Arrays.asList("Nikesh's first message", "Spike's first message");
        User leo = new User("Leo");
        User nikesh = new User("Nikesh");
        User spike = new User("Spike");
        nikesh.publish("Nikesh's first message");
        spike.publish("Spike's first message");
        leo.subscribe(nikesh);
        leo.subscribe(spike);
        assertEquals(expected, leo.subscriptions.list());
    }
    @Test
    public void userCanViewSubscriptions() {
        String expected = "Nikesh's first message\nSpike's first message";
        User leo = new User("Leo");
        User nikesh = new User("Nikesh");
        User spike = new User("Spike");
        nikesh.publish("Nikesh's first message");
        spike.publish("Spike's first message");
        leo.subscribe(nikesh);
        leo.subscribe(spike);
        assertEquals(expected, leo.viewSubscriptions());
    }

}