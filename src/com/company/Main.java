package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of Players:");

        int numberOfPlayersChosen = scanner.nextInt();
        System.out.println(numberOfPlayersChosen + " are participating.");

        ArrayList<String> players = new ArrayList<>();

        for (int i = 0; i < numberOfPlayersChosen; i++) {
            System.out.println("Enter the name of the Player:");
            players.add((scanner.next()));
            System.out.println(players);
        }
        ArrayList<String> choice = new ArrayList<>();

        for (int i = 0; i < numberOfPlayersChosen; i++) {
            System.out.println(players.get(i) + ", choose Stone, Scissor or Paper");
            choice.add((scanner.next()));
        }
        for (int i = 0; i < numberOfPlayersChosen; i++) {
            if (choice.get(i).equals("Stone")) {
                players.remove((choice.indexOf("Scissor")));
            }
            else if (choice.get(i).equals("Scissor")) {
                players.remove((choice.indexOf("Paper")));
            }
            else {
                players.remove((choice.indexOf("Stone")));
            }
            System.out.println(choice);
            System.out.println("choice.get 0" + choice.get(0));
            System.out.println("The winner is... "+ players);
        }
        /*if (choice.get(i) == "Stone") {
                players.remove((String.valueOf(i + 1)));
            }
            System.out.println(choice);
            System.out.println(players);*/
         /* if (choice.contains("Stone") && choice.contains("Scissor")) {
            System.out.println("Stone won the game.");
        } else if (choice.contains("Scissor") && choice.contains("Paper")) {
            System.out.println("Scissor won the game.");
        } else if (choice.contains("Paper") && choice.contains("Stone")) {
            System.out.println("Paper won the game.");
        } else {
            System.out.println("Standoff - play again!");
        }*/
    }
}


// Method playAgain nach Eingabe
// Test schreiben
// Exception handlen
// Punktestand einführen
// Rechtschreibung
/*
Mehrere Spieler einbauen:

Welcher der Spieler hat gewonnen? Contains ist zu ungenau, mal mit get(i) auf Index programmieren.
Spielbeginn: Spieler 1  hat Schere, Spieler 2 Papier,  Spieler 3 hat Papier
Prüfung Runde 1: Spieler 1  hat Schere, Spieler 2 Papier also ist Spieler 2 raus
Prüfung Runde 2: Spieler 1 hat Schere, Spieler 3 hat Papier >> Spieler 3 ist raus
Ergebnis: Spieler 1 hat gewonnen
Reihenfolge-Prüfung, Spieler dann removen  und automatisch neue Runde
Alle drei Kombis ungültig
 */