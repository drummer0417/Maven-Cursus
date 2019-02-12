package nl.androidappfactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {

    Car car;

    @Before
    public void setup() {

        car = new Car("Citroen", "C3");

    }

    @Test
    public void getMake() {

        assertEquals("Citroen", car.getMake());
    }

    @Test
    public void getModel() {

        assertEquals("C3", car.getModel());
    }
}