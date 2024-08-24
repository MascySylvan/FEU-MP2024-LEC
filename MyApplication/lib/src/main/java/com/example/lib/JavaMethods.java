package com.example.lib;

public class JavaMethods {

    public static final String PLANETNAME = "Earth";

    public static void main(String[] args) {
        //Methods
        // <returnType> <methodName>() {
            //body
        //}
        printName();
        printName2();

        System.out.println(Sa.speed);

        //Parameters
        int add = sum(1,2);
        System.out.println(add);

        //Overloading
        double doub = sum(10.1,2.3);
        System.out.println(doub);

        int add3 = sum(1,2, 3);
        System.out.println(add3);

        //Overriding

    }

    public static int sum(int x, int y) {
        return x + y;
    }

    public static int sum(int x, int y, int z) {
        return x + y + z;
    }

    public static double sum(double x, double y) {
        return x + y;
    }

    static void printName() {
        System.out.println("Name");
    }

    public static void printName2() {
        System.out.println("Name2");
    }

    private static String getName() {
        return "Nameee";
    }

    protected static String getName2() {
        return "Nameee2";
    }

}

class Sa {
    public static String speed = "100";
}
