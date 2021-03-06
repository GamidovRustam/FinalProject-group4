package com.goit.javaonline3.gcd;

public class Gcd {

    public static int findGcd(int firstNumber, int secondNumber) {
        int moduleOfMinimalNumber = Math.abs(firstNumber);
        int gcd = 0;

        if (moduleOfMinimalNumber > Math.abs(secondNumber)) {
            moduleOfMinimalNumber = Math.abs(secondNumber);
        }

        for (int count = 1; count <= moduleOfMinimalNumber; count++) {

            if (firstNumber % count == 0 && secondNumber % count == 0) {

                if (count > gcd) {
                    gcd = count;
                }
            }
        }
        return gcd;
    }
}