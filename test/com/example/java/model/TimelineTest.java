package com.example.java.model;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TimelineTest {

    @Test
    public void userCanAddtoTimeline(){
        List<String> expected = Arrays.asList("My first message", "My second message");
        Timeline timeline = new Timeline();
        timeline.add("My first message");
        timeline.add("My second message");
        assertEquals(expected, timeline.getTimeline() );

    }

    @Test
    public void userCanViewATimeline(){
        String expected = "Nikesh: My first message\nNikesh: My second message";
        Timeline timeline = new Timeline();
        User nikesh = new User("Nikesh");
        User spike = new User("Spike");
        nikesh.publish("My first message");
        nikesh.publish("My second message");
        assertEquals(expected, timeline.view(nikesh) );

    }

}