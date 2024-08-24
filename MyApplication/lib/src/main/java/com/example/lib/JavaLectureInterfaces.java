package com.example.lib;

public class JavaLectureInterfaces {

    public static void main(String[] args) {
        Services serv = new ServicesImpl();
        System.out.println(serv.getString());

    }
}

interface Services {
    String getString();
    int getNum();
    boolean returnTrue();
}

class ServicesImpl implements Services {

    @Override
    public String getString() {
        return "This is my String";
    }

    @Override
    public int getNum() {
        return 0;
    }

    @Override
    public boolean returnTrue() {
        return true;
    }
}
