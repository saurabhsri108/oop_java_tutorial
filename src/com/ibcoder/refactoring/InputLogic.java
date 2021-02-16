package com.ibcoder.refactoring;

import java.util.Scanner;

public class InputLogic {
    private static Scanner scanner = new Scanner(System.in);

    public static double readInput(String promptMessage, int min, int max) {
        double value;
        while (true) {
            System.out.print(promptMessage);
            value = scanner.nextDouble();
            if (value >= min && value <= max)
                break;
            System.out.printf("Enter a value between %s and %s%n", min, max);
        }
        return value;
    }
}
