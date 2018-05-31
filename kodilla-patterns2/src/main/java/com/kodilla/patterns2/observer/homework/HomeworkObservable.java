package com.kodilla.patterns2.observer.homework;

public interface HomeworkObservable {
    void registerObserver(HomeworkObserver obsrever);
    void notifyObservers();
    void removeObserver(HomeworkObserver obsrever);
}
