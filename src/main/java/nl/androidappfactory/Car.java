package nl.androidappfactory;

public class Car {

    String make;
    Double price;

    public Car(String make) {

        this.make = make;
    }

    public Car(String make, Double price) {

        this.make = make;
        this.price = price;
    }

    public String getMake() {

        return make;
    }

    public void setMake(String make) {

        this.make = make;
    }

    public Double getPrice() {

        return price;
    }

    public void setPrice(Double price) {

        this.price = price;
    }

    @Override
    public String toString() {

        return "Car{" +
                "make='" + make + '\'' +
                ", price=" + price +
                '}';
    }
}
