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
        if (choice.contains("Stone") && choice.contains("Scissor")) {
            System.out.println("Stone won the game.");
        } else if (choice.contains("Scissor") && choice.contains("Paper")) {
            System.out.println("Scissor won the game.");
        } else if (choice.contains("Paper") && choice.contains("Stone")) {
            System.out.println("Paper won the game.");
        } else {
            System.out.println("Standoff - play again!");
        }
    }
}
