package org.example.Seminar02.hw;

public class Laptop {
    private String product;
    private Integer randomMemory;
    private Integer hardDisk;
    private String operSystem;
    private String color;

    public Laptop(String product, int randomMemory, int hardDisk, String operSystem, String color) {
        this.product = product;
        this.randomMemory = randomMemory;
        this.hardDisk = hardDisk;
        this.operSystem = operSystem;
        this.color = color;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Integer getRandomMemory() {
        return randomMemory;
    }

    public void setRandomMemory(Integer randomMemory) {
        this.randomMemory = randomMemory;
    }

    public Integer getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(Integer hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getOperSystem() {
        return operSystem;
    }

    public void setOperSystem(String operSystem) {
        this.operSystem = operSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "producer='" + product + '\'' +
                ", randomMemory=" + randomMemory +
                ", hardDisk=" + hardDisk +
                ", operSystem='" + operSystem + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
