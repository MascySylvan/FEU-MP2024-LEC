package com.example.lib;

public class SampleClass {
    public static void main(String[] args) {
        Appliance lg1 = new Appliance();
        lg1.setBrand("LG");
    }

    public void printSomething() {
        System.out.println("123");
    }
}

class Appliance {
    private String brand;
    private String model;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
