package com.kaviraj;

public class ObjectReferenceExample {
    public static void main(String[] args) {
        Car audi = new Car("Electric", 4, "Audi");
        System.out.println(audi.engine + " " + audi.noOfSeats + " " + audi.manufacturer);

        Car maruti = audi;
        // this does not copy audi object to maruti, but maruti and audi now point
        // to the same object in heap memory.

        maruti.changeEngine("Diesel");

        System.out.println(audi.engine + " " + audi.noOfSeats + " " + audi.manufacturer);
    }
}

class Car {
    String engine;
    int noOfSeats;
    String manufacturer;

    Car (String engine, int noOfSeats, String manufacturer) {
        this.engine = engine;
        this.manufacturer = manufacturer;
        this.noOfSeats = noOfSeats;
    }
    void changeEngine (String engine) {
        this.engine = engine;
    }
}
