package org.example.Seminar03.hw;

public class Main {
    public static void main(String[] args) {
        CocoaCapacity capacity = new  CocoaCapacity();
        for (int i = 0; i < 3; i++){
            if (i%2 == 0){
                capacity.addProduct(new Cocoa(i*2,i*40,i*2,"criollo " + i));
            } else {
                capacity.addProduct(new Coffee(i*1,i*45,i*3,"arabic " + i));
            }
        }
        capacity.print();
        capacity.sort(new ProductCompare());
        System.out.println("<<<>>>");
        capacity.print();
    }
}
