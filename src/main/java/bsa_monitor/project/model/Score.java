package bsa_monitor.project.model;

public class Score {
    private Subject subject;
    private double grade;
    private int points;

    public Score(Subject subject, double grade) {
    }

    public Subject getSubject() {
        return new Subject("",0,0);
    }

    public double getGrade() {
        return 0;
    }

    public int getPoints() {
        return 0;
    }
}
