package com.kodilla.patterns2.observer.forum;

public interface Observable {
    void registerObserver(Observer obsrever);
    void notifyObservers();
    void removeObserver(Observer obsrever);
}
