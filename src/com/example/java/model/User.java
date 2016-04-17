package com.example.java.model;

import java.util.ArrayList;
import java.util.List;

public class User {

  public User() {
  }

  private String name;

  public Timeline timeline = new Timeline();

  public Subscription subscriptions = new Subscription();

  public User(String name) {
    this.name = name;
  }

  public void publish(String message) {
    timeline.add(message);
  }

  public String getName() {
    return name;
  }

  protected List<String> getTimeline() {
    return timeline.getTimeline();
  }

  public String viewTimeline(User user) {
    return timeline.view(user);
  }

  public void subscribe(User user) {
    subscriptions.add(user);
  }

  public String viewSubscriptions() {
    return subscriptions.view();
  }
}