package com.example.lib;

public class JavaLecturePolymorphism {

    public static void main(String[] args) {
        Vehicle vhc = new Vehicle();
        Car car = new Car();
        Motorcycle mc = new Motorcycle();

        vhc.sound();
        car.sound();
        mc.sound();

    }
}

class Vehicle {
    public void sound() {
        System.out.println("The Vehicle makes a sound");
    }
}

class Car extends Vehicle {

    @Override
    public void sound() {
        System.out.println("The car sounds: beep beeeeep");
    }
}

class Motorcycle extends Vehicle {
    public void sound() {
        System.out.println("The Motorcycle sounds: vrooommmm");
    }
}
