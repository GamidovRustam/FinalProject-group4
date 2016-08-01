package com.goit.javaonline3.nod;

import org.junit.Test;

import static org.junit.Assert.*;

public class GcdTest {

    @Test(timeout = 3000)
    public void testFindNodForPositiveNumbers() throws Exception {
        assertTrue(5 == Gcd.findGcd(25, 5));
    }

    @Test(timeout = 3000)
    public void testFindNodForNegativeNumbers() throws Exception {
        assertTrue(5 == Gcd.findGcd(-25, -5));
    }

    @Test(timeout = 3000)
    public void testFindNodForHybridNumbers() throws Exception {
        assertTrue(5 == Gcd.findGcd(-5, 25));
    }

    @Test(timeout = 3000)
    public void testFindNodForPrimeNumbers() throws Exception {
        assertTrue(1 == Gcd.findGcd(7, 13));
    }

    @Test(timeout = 3000)
    public void testFindNodForZero() throws Exception {
        assertTrue(0 == Gcd.findGcd(100500, 0));
    }

    @Test(timeout = 3000)
    public void testFindNodForSameNumbers() throws Exception {
        assertTrue(100500 == Gcd.findGcd(100500, 100500));
    }
}