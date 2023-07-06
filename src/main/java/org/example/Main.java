package org.example;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, String> numbers = new HashMap<>();

        Random r = new Random();

        map.put(0, 2);
        map.put(1, 0);
        map.put(2, 1);

        numbers.put(0, "Rock");
        numbers.put(1, "Paper");
        numbers.put(2, "Scissors");

        printOptions();

        int userChoice = Integer.parseInt(input.nextLine());
        int cpuChoice = r.nextInt(3);

        System.out.print("Your choice: " + numbers.get(userChoice) + "\n");
        System.out.println("CPU choice: " + numbers.get(cpuChoice) + "\n");

        if (userChoice == cpuChoice) {

            System.out.println("Draw game");
        }

        else if (userChoice == 0 && cpuChoice == 2) {

            System.out.println("You win");
        }

        else if (userChoice == 1 && cpuChoice == 0) {

            System.out.println("You win");
        }

        else if (userChoice == 2 && cpuChoice == 1) {

            System.out.println("You win");
        }

        else {

            System.out.println("CPU wins");
        }
    }

    public static void printOptions() {

        System.out.println("Please choose one of the following: ");
        System.out.println("""
                0 - Rock
                1 - Paper
                2 - Scissors""");
    }
}