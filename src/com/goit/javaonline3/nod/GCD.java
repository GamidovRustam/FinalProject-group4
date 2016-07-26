package com.goit.javaonline3.nod;

public class GCD {

    public static int findGCD(int firstNumber, int secondNumber) {
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