package bsa_monitor.project.model;

public class Score {
    private Subject subject;
    private double grade;
    private int points;

    public Score(Subject subject, double grade) {
        this.subject = subject;
        this.grade = grade;
        if (grade >= subject.getPassMark()) {
            points = subject.getPoints();
        } else {
            points = 0;
        }
    }

    public Subject getSubject() {
        return subject;
    }

    public double getGrade() {
        return grade;
    }

    public int getPoints() {
        return points;
    }
}
