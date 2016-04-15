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
    
}