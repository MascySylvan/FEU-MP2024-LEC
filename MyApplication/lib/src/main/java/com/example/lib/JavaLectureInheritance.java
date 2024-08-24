package com.example.lib;

public class JavaLectureInheritance {

    public static void main(String[] args) {
        IPhone i15 = new IPhone();
        Android samsung = new Android();

        i15.clickSounds();
        samsung.clickSounds();
    }
}

//Parent Class
class CellPhone {
    public void clickSounds() {
        System.out.println("Toot Toooot");
    }
}

//Child class
class IPhone extends CellPhone {
    public String getModel() {
        return "Iphone 47 Pro Max++";
    }
}

class Android extends CellPhone {
    public String getModel() {
        return "Samsung Milky Way S100 --";
    }
}
