package com.example.lib;

public class MyClass {

    public static void main(String[] args) {
        SampleObject sObj1 = new SampleObject();
        sObj1.setName("Name1");

        System.out.println(sObj1.getName());

        SampleObject sObj2 = sObj1;
        sObj2.setName("Name2");

        System.out.println(sObj2.getName());
        System.out.println(sObj1.getName());
    }
}

class SampleObject {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}