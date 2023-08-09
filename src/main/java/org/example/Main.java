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

        int userChoice = Integer.parseInt(input.nextLine()) - 1;
        int cpuChoice = r.nextInt(3);

        System.out.print("\033[0;1m" + "Your choice: " + "\033[0;m" + numbers.get(userChoice) + "\n");
        System.out.println("\033[0;1m" + "CPU choice: " + "\033[0;m" + numbers.get(cpuChoice) + "\n");

        if (userChoice == cpuChoice) {

            System.out.println("\033[0;1m" + "Draw game!");
        }

        else if (map.get(userChoice) == cpuChoice) {

            System.out.println("\033[0;1m" + "You win!");
        }

        else {

            System.out.println("\033[0;1m" + "CPU wins!");
        }
    }

    public static void printOptions() {

        System.out.println("Please choose one of the following: ");
        System.out.println("""
                1 - Rock
                2 - Paper
                3 - Scissors""");
    }
}