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
        int cpuChoice = r.nextInt(2);

        System.out.println("CPU choice: " + numbers.get(cpuChoice) + "\n");

        if (userChoice == map.get(cpuChoice)){

            System.out.println("User wins");
        }

        else if (map.get(userChoice) != map.get(cpuChoice)){

            System.out.println("CPU wins");
        }

        else {

            System.out.println("Draw game");
        }
    }

    public static void printOptions() {

        System.out.println("Please choose one of the following: ");
        System.out.println("0 - Rock\n" + "1 - Paper\n" + "2 - Scissors");

    }
}