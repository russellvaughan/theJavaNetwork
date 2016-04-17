#TheJavaNetwork

#####Author
- Russell Vaughan ([russellvaughan](https://github.com/russellvaughan))


###Description
A console-based social networking application (similar to Twitter) where a user can be created, a user can publish messages to a personal timeline, a user can view other user's timelines, and a user can subcribe to follow other users and see an aggregated feed of their messages. 

###Instructions

To deploy local version

```
$ git clone https://github.com/russellvaughan/theJavaNetwork

```

###Technologies
- Java
- IntelliJ IDEA
- JUnit (97% Test Coverage)

###Example Code From 'View Subscription' User Story

```
 User leo = new User("Leo");
 User nikesh = new User("Nikesh");
 User spike = new User("Spike");
 nikesh.publish("Nikesh's first message");
 spike.publish("Spike's first message");
 leo.subscribe(nikesh);
 leo.subscribe(spike);
 leo.viewSubscriptions());
```

 
###Implemented User Stories
```
As a User
So that I can use TheJavaNetwork
I want to be able to create a user
```

```
As a User
So that I can share my thoughts
I want to be able to publish messages to a timeline
```

```
As a user
So that I can see other people's messages
I want to be able to view their timelines.
```

```
As a user
So that I can see an aggregated feed of other users's messages.
I want to be able to subscribe to other user's timelines.
```
