package bsa_monitor.project.model;

public class Score {
    private Vak vak;
    private double cijfer;
    private int punten;

    public Score(Vak vak, double cijfer) {
        this.vak = vak;
        this.cijfer = cijfer;
        if (cijfer >= vak.getCesuur()) {
            punten = vak.getPunten();
        } else {
            punten = 0;
        }
    }

    public Vak getVak() {
        return vak;
    }

    public double getCijfer() {
        return cijfer;
    }

    public int getPunten() {
        return punten;
    }
}
