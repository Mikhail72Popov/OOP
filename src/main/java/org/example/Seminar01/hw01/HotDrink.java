package org.example.Seminar01.hw01;

public class HotDrink extends Drink{
    private Integer temperature;

    public HotDrink(String name, Double price, int volume, int temperature) {
        super(name, price, volume);
        this.temperature = temperature;
    }

    public Integer getTemperature() {
        return temperature;
    }
}

