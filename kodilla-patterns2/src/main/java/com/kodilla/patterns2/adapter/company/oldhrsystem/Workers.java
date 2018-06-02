package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"4526556", "John", "Smith"},
            {"4563365", "ivone", "Novak"},
            {"5126685", "jessie", "Pinkman"},
            {"7544564", "Walter", "White"},
            {"7456884", "Clara", "Lanson"}};
    private double[] salaries = {
        4500.00,
        3700.00,
        4350.00,
        9000.00,
        6200.00};
    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + " , " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
