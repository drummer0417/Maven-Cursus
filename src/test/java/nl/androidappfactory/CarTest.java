package nl.androidappfactory;


public class CarTest {

    public void testGetMake() {

        Car car = new Car("Citroen", 20000d);
        assert ("Citroena".equals(car.getMake()));
    }
}