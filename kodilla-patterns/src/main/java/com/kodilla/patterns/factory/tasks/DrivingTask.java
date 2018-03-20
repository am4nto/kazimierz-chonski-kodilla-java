package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private String taskName;
    private String where;
    private String using;
    private boolean isExecuted;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
        this.isExecuted = false;
    }

    @Override
    public String executeTask() {
        if (!isExecuted) {
            this.isExecuted = true;
            return "Pojechano do: " + where + ", uzyty srodek transportu: " + using;
        } else return "Zadanie już wykonane";
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isExecuted;
    }
}
