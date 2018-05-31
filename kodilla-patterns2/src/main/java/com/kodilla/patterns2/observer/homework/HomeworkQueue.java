package com.kodilla.patterns2.observer.homework;

import java.util.LinkedList;
import java.util.List;

public class HomeworkQueue implements HomeworkObservable {
    private final String studentName;
    private final List<String> homeworks;
    private final List<HomeworkObserver> obsrevers;

    public HomeworkQueue(String studentName) {
        this.studentName = studentName;
        homeworks = new LinkedList<>();
        obsrevers = new LinkedList<>();
    }

    public String getStudentName() {
        return studentName;
    }

    public List<String> getHomeworks() {
        return homeworks;
    }

    public void addHomework(String homework) {
        homeworks.add(homework);
        notifyObservers();
    }

    @Override
    public void registerObserver(HomeworkObserver obsrever) {
        obsrevers.add(obsrever);
    }

    @Override
    public void notifyObservers() {
        for (HomeworkObserver observer : obsrevers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(HomeworkObserver obsrever) {
        obsrevers.remove(obsrever);
    }
}
