package org.example.Seminar03.hw;

public class Coffee extends Product{

    public Coffee(Integer size, Integer temper, Integer sugar, String grade) {
        super(size, temper, sugar, grade);
    }

    @Override
    public String toString() {
        return "Coffee " + this.getTemper() + " " + this.getSize();
    }
}
