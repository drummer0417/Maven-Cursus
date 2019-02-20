package nl.androidappfactory;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComputeTest {

    @Test
    public void add() {

        Compute rekenmachine = new Compute();
        int uitkomst = rekenmachine.add(1, 4);

        assertEquals(5, uitkomst);
    }
}