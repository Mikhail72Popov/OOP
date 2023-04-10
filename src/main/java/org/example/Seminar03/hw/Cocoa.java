package org.example.Seminar03.hw;

public class Cocoa extends Product{

    public Cocoa(Integer size, Integer temper, Integer sugar, String grade) {
        super(size, temper, sugar, grade);
    }

    @Override
    public String toString() {
        return "Cocoa " + this.getTemper() + " " + this.getSize();
    }
}
