package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String shopping = "shopping";
    public static final String painting = "painting";
    public static final String driving = "driving";

    public Task makeTask(String taskClass) {
        switch (taskClass) {
            case shopping:
                return new ShoppingTask("zakupy", "czekolada", 3);
            case painting:
                return new PaintingTask("malowanie", "niebieski", "sypialnia");
            case driving:
                return new DrivingTask("przejazdzka", "Berlin", "hulajnoga");
            default: return null;
        }
    }
}
