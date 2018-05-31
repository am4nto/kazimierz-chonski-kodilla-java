package com.kodilla.patterns2.observer.forum;

import java.util.ArrayList;
import java.util.List;

public class ForumTopic implements Observable {
    private final String name;
    private final List<String> messages;
    private final List<Observer> obsrevers;

    public ForumTopic(String name) {
        this.name = name;
        messages = new ArrayList<>();
        obsrevers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<String> getMessages() {
        return messages;
    }

    public void addPost(String post) {
        messages.add(post);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer obsrever) {
        obsrevers.add(obsrever);
    }

    @Override
    public void notifyObservers() {
        for (Observer obsrever : obsrevers) {
            obsrever.update(this);
        }
    }

    @Override
    public void removeObserver(Observer obsrever) {
        obsrevers.remove(obsrever);
    }
}
