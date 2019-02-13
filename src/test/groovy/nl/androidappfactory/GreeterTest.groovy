package nl.androidappfactory

import spock.lang.Specification

class GreeterTest extends Specification {
    void setup() {
    }

    void cleanup() {
    }

    def "SayHello With given name"() {

        given:
        def greeter = new Greeter()
        def name = "Hans"

        when:
        def greet = greeter.sayHello(name)

        then:
        greet.equals("Hallo Hans!")
    }

    def "SayHello Without given name"() {

        given:
        def greeter = new Greeter()
        def name = null

        when:
        def greet = greeter.sayHello(name)

        then:
        greet.equals("Hallo guys!")
    }

    def "numbers to the power of two"(int a, int b, int c) {
        expect:
        Math.pow(a, b) == c

        where:
        a | b | c
        1 | 2 | 1
        2 | 2 | 4
        3 | 2 | 9
        3 | 3 | 27
        3 | 4 | 81
    }
}
