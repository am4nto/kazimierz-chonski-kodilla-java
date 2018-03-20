package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public Task makeTask(String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("zakupy", "czekolada", 3);
            case PAINTING:
                return new PaintingTask("malowanie", "niebieski", "sypialnia");
            case DRIVING:
                return new DrivingTask("przejazdzka", "Berlin", "hulajnoga");
            default: return null;
        }
    }
}
