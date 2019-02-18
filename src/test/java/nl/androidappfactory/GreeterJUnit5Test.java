package nl.androidappfactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreeterJUnit5Test {

    @BeforeEach
    void setUp() {

    }

    @Test
    void sayHello() {

        assertTrue("a".equals("a"));
    }

    @Test
    void dontSayHello() {

        assertTrue("a".equals("a"));
    }
}