package com.example.java.model;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SubscriptionTest {
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
    public void userCanViewTheirSubscriptions() {
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