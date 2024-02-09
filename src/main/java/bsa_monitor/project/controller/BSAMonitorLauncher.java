package bsa_monitor.project.controller;

import bsa_monitor.project.model.*;

import java.util.Scanner;

public class BSAMonitorLauncher {

    public static void main(String[] args) {
        final double UPPER_LIMIT_GRADE = 10.0;
        final double LOWER_LIMIT_GRADE = 1.0;
        final double PASS_MARK = 5.5;
        final double BSA_RATIO = 5/6.0;
        final int TOTAL_POINTS_TO_ACHIEVE = 28;
        int totalPointsAchieved = 0;

        // Initiëer de vakken (namen en punten).
        Subject[] subjects = new Subject[7];
        subjects[0] = new Subject("Project Fasten Your Seatbelts", 12, PASS_MARK);
        subjects[1] = new Subject("Programming", 3, PASS_MARK);
        subjects[2] = new Subject("Databases", 3, PASS_MARK);
        subjects[3] = new Subject("Personal skills", 2, PASS_MARK);
        subjects[4] = new Subject("Project Skills", 2, PASS_MARK);
        subjects[5] = new Subject("OOP", 3, PASS_MARK);
        subjects[6] = new Subject("User Interaction", 3, PASS_MARK);

        Score[] scores = new Score[7];

        // Vraag de gebruiker om input en sla dit op in de array scores.
        Scanner input = new Scanner(System.in);
        System.out.println("Voer behaalde cijfers in:");
        for (int subjectCounter = 0; subjectCounter < 7; subjectCounter++) {
            boolean incorrectInput = true;
            while (incorrectInput) {
                System.out.print(subjects[subjectCounter].getName() + ": ");
                double grade = input.nextDouble();
                if (grade < LOWER_LIMIT_GRADE || grade > UPPER_LIMIT_GRADE) {
                    System.out.printf("Ongeldige invoer!\nHet in te voeren cijfer dient tussen de %.1f en %.1f te zijn.\nProbeer nogmaals: ", LOWER_LIMIT_GRADE, UPPER_LIMIT_GRADE );
                } else {
                    scores[subjectCounter] = new Score(subjects[subjectCounter], grade);
                    totalPointsAchieved += scores[subjectCounter].getPoints();
                    incorrectInput = false;
                }
            }
        }

        // print overzicht
        System.out.println();
        for (int scoreTeller = 0; scoreTeller < scores.length; scoreTeller++) {
            System.out.printf("Vak/project: %-30s Cijfer: %-4.1f Behaalde punten: %-3d\n",
                    scores[scoreTeller].getSubject().getName(), scores[scoreTeller].getGrade(), scores[scoreTeller].getPoints());
        }

        // print totaal aantal behaalde punten
        System.out.printf("\nTotaal behaalde studiepunten: %d/%d\n", totalPointsAchieved, TOTAL_POINTS_TO_ACHIEVE); // lege regel
        // print BSA waarschuwing als behaalde punten kleiner dan gegeven ratio
        if (totalPointsAchieved < BSA_RATIO * TOTAL_POINTS_TO_ACHIEVE) {
            System.out.println("PAS OP: je ligt op schema voor een negatief BSA!");
        }
    }
}
