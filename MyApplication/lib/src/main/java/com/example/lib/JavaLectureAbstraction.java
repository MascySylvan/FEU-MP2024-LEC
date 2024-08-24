package com.example.lib;

public class JavaLectureAbstraction {

    public static void main(String[] args) {
        Dog kuma = new Dog();
        Cat kitty = new Cat();
        Pig oink = new Pig();

        kuma.soundMakes();
        kitty.soundMakes();
        oink.soundMakes();
    }
}

abstract class Animal {
    //abstract method have no body
    public abstract void soundMakes();
    //can also have regular methods
    public void jumpSound() {
        System.out.println("Boing!");
    }
}

//subclass
class Dog extends Animal {
    public void soundMakes() {
        System.out.println("Arf! Arf!");
    }
}

class Cat extends Animal {
    public void soundMakes() {
        System.out.println("Meeeooooowwww!!!");
    }
}

class Pig extends Animal {

    @Override
    public void soundMakes() {
        System.out.println("Oink oink");
    }
}
