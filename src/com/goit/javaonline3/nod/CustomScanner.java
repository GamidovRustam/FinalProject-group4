package com.goit.javaonline3.nod;

import java.util.Scanner;

public class CustomScanner {
    private static final Scanner scanner = new Scanner(System.in);

    public static int getInt() {

        while (true) {

            if (scanner.hasNextInt()) {
                return scanner.nextInt();
            } else {
                System.out.println("Incorrect value! Please enter just integer:");
                scanner.next();
            }
        }
    }

    public static void close() {
        scanner.close();
    }

}
