package bsa_monitor.project.controller;

import bsa_monitor.project.model.*;

import java.util.Scanner;

public class BSAMonitorLauncher {

    public static void main(String[] args) {
        final double BOVENGRENSCIJFER = 10.0;
        final double ONDERGRENSCIJFER = 1.0;
        final double CESUUR_WAARDE = 5.5;
        final double BSA_RATIO = 5/6.0;
        final int TOTAAL_STUDIEPUNTEN = 28;
        int totaalBehaaldePunten = 0;

        // Initieer de vakken (namen en punten).
        Vak[] vakken = new Vak[7];
        vakken[0] = new Vak("Project Fasten Your Seatbelts", 12, CESUUR_WAARDE);
        vakken[1] = new Vak("Programming", 3, CESUUR_WAARDE);
        vakken[2] = new Vak("Databases", 3, CESUUR_WAARDE);
        vakken[3] = new Vak("Personal skills", 2, CESUUR_WAARDE);
        vakken[4] = new Vak("Project Skills", 2, CESUUR_WAARDE);
        vakken[5] = new Vak("OOP", 3, CESUUR_WAARDE);
        vakken[6] = new Vak("User Interaction", 3, CESUUR_WAARDE);

        Score[] scores = new Score[7];

        // Vraag de gebruiker om input en sla dit op in de array scores.
        Scanner input = new Scanner(System.in);
        System.out.println("Voer behaalde cijfers in:");
        for (int vakTeller = 0; vakTeller < 7; vakTeller++) {
            boolean incorrectInput = true;
            while (incorrectInput) {
                System.out.print(vakken[vakTeller].getNaam() + ": ");
                double cijfer = input.nextDouble();
                if (cijfer < ONDERGRENSCIJFER || cijfer > BOVENGRENSCIJFER) {
                    System.out.printf("Ongeldige invoer!
Het in te voeren cijfer dient tussen de %.1f en %.1f te zijn.
Probeer nogmaals: ", ONDERGRENSCIJFER, BOVENGRENSCIJFER );
                } else {
                    scores[vakTeller] = new Score(vakken[vakTeller], cijfer);
                    totaalBehaaldePunten += scores[vakTeller].getBehaaldePunten();
                    incorrectInput = false;
                }
            }
        }

        // print overzicht
        System.out.println();
        for (int scoreTeller = 0; scoreTeller < scores.length; scoreTeller++) {
            System.out.printf("Vak/project: %-30s Cijfer: %-4.1f Behaalde punten: %-3d
",
                    scores[scoreTeller].getVak().getNaam(), scores[scoreTeller].getCijfer(), scores[scoreTeller].getBehaaldePunten());
        }

        // print totaal aantal behaalde punten
        System.out.printf("
Totaal behaalde studiepunten: %d/%d
", totaalBehaaldePunten, TOTAAL_STUDIEPUNTEN); // lege regel
        // print BSA waarschuwing als behaalde punten kleiner dan gegeven ratio
        if (totaalBehaaldePunten < BSA_RATIO * TOTAAL_STUDIEPUNTEN) {
            System.out.println("PAS OP: je ligt op schema voor een negatief BSA!");
        }
    }
}
