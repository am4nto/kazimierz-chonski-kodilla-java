package com.kodilla.patterns2.observer.homework;

public class Mentor implements HomeworkObserver {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public void update(HomeworkQueue homeworkQueue) {
        System.out.println(name + ": Kursant " + homeworkQueue.getStudentName() + " wyslal prace domowa.");
        updateCount++;
    }
}
