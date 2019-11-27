package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Define number of Players:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of all Player:");

        int numberOfPlayerChosen = scanner.nextInt();
        System.out.println(numberOfPlayerChosen + " Player will participate");

        String[] Players = new String[numberOfPlayerChosen];


        for (int i = 0; i < numberOfPlayerChosen; i++) {
            System.out.println("Enter Name of Player");
            Players[i] = scanner.next();
        }

        String[] choice = new String[numberOfPlayerChosen];

        for (int i = 0; i < Players.length; i++) {
            System.out.println(Players[i] + ", Choose Rock, Paper, Scissors");
            choice[i] = scanner.next();
        }
/*Grund warum !0 in if nicht nötig: bei choice.length kann null nicht sein >> Schleife startet dann nicht.
 Gewinner wird ermittelt. Besser: verlierer elimieren.
 5 Spieler:

* */
        for (int currentPlayerIndex = 0; currentPlayerIndex < choice.length; currentPlayerIndex++) {
            for (int otherPlayerIndex)
            if ("Rock".equals(choice[currentPlayerIndex]) && "Paper".equals(choice[otherPlayerIndex])) {
                results[currentPlayerIndex]=0; // im results Array wird dann der currentPlayerIndex "Rock" auf 0 gesetzt.
            } else if ("Rock".equals(choice[0]) && "Scissor".equals(choice[1])) {
                System.out.println(Players[0] + " won the game.");
            } else if ("Rock".equals(choice[0]) && "Rock".equals((choice[1]))) {
                System.out.println("Next Round");
            } else if ("Scissor".equals(choice[0]) && "Paper".equals((choice[1]))) {
                System.out.println(Players[0] + " won the game.");
            } else if ("Scissor".equals(choice[0]) && "Stone".equals((choice[1]))) {
                System.out.println(Players[1] + " won the game.");
            } else if ("Scissor".equals(choice[0]) && "Scissor".equals((choice[1]))) {
                System.out.println("Next Round");
            } else if ("Paper".equals(choice[0]) && "Scissor".equals((choice[1]))) {
                System.out.println(Players[1] + " won the game.");
            } else if ("Paper".equals(choice[0]) && "Stone".equals((choice[1]))) {
                System.out.println(Players[0] + " won the game.");
            } else {
                System.out.println("Next Round");
            }
        }
    }
    /*Spieler 1 wähle Stein, Schere Papier
     * Spieler 2 wähle Stein, Schere, papier
     * Bedingung / Berechnung
     * Winner
     * Dann Schleife und dann mehrere Spieler
     * Problem: meine Conditions sind statisch. Sollten drei Spieler spielen, funktioniert es nicht mehr.
     * Zusätlzich wird das Ergebnis nach i ausgegeben.
     * Außerdem ist das ganze sehr lang und umständlich.
     * Neu:
     * im Array:
     * Rock schlägt Schere
     * Schere schlägt Papier
     * Papier schlägt Rock
     * Wenn alle drei drin, patt
     * bei drei Spieler
     * */

    // unterhalb der main method aber innerhalb der class
}

