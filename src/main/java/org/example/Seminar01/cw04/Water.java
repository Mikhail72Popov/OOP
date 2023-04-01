package org.example.cw04;

public class Water extends Product {
    private Integer volume;

    public Integer getVolume() {
        return volume;
    }

    public Water(String name, Double price, Integer volume) {
        super(name, price);
        this.volume = volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Water(String name, Double price){
        super(name, price);
    }
}
