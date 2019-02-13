package nl.androidappfactory;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest4Test {

    @Test
    public void getMake() {

        Car car = new Car("Ford", "Focus");
        assertEquals("Ford", car.getMake());
    }
}