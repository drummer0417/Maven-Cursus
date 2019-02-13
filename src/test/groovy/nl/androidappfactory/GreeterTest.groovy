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
}
