package nl.androidappfactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car;

    @BeforeEach
    void setUp() {

        car = new Car("Citroen", "C3");
    }

    @Test
    void getMake() {

        assertEquals("Citroen", car.getMake());
    }

    @Test
    void getModel() {

        assertEquals("C3", car.getModel());
    }
}