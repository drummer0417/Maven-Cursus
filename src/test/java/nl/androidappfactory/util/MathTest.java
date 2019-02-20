package nl.androidappfactory.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class MathTest {

    @Test
    public void add() {

        assertEquals(6, Math.add(5, 1));
    }

    @Test
    public void substract() {

        assertEquals(5, Math.substract(7, 2));
    }

    @Test
    public void multiply() {

        assertEquals(15, Math.multiply(5, 3));
    }
}