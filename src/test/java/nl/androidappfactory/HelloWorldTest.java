package nl.androidappfactory;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void sayHello() {

        HelloWorld greeter = new HelloWorld();
        assertEquals("Hallooooootjes wereldbol", (greeter.sayHello()));
    }
}