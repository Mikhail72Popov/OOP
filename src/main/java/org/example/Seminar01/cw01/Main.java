package org.example.Seminar01.cw01;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("barsik");
        System.out.println(cat.getName());
        cat.saySomtheing();
        cat.sayWithInterfase();
        BengalCat cat1 = new BengalCat();
        cat1.saySomtheing();
    }

}
