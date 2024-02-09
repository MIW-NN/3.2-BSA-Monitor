package bsa_monitor.project.model;

public class Subject {
    private String name;
    private int points;
    private double passMark;

    public Subject(String name, int points, double passMark) {
        this.name = name;
        this.points = points;
        this.passMark = passMark;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public double getPassMark() {
        return passMark;
    }
}
