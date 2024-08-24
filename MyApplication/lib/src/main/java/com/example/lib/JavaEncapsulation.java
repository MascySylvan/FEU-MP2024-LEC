package com.example.lib;

public class JavaEncapsulation {

    public static void main(String[] args) {

        Person mascy = new Person();
        mascy.setName("Mascy");

        System.out.println(mascy.getName());
        
    }
}

class Person {
    private String name;
    private int age;

    //Getter
    public String getName() {
        return name;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }
}
