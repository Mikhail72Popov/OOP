package org.example.Seminar03.hw;

public abstract class Product {
    private Integer size;
    private Integer temper;
    private Integer sugar;
    private String grade;

    public Product(Integer size, Integer temper, Integer sugar, String grade) {
        this.size = size;
        this.temper = temper;
        this.sugar = sugar;
        this.grade = grade;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Integer getTemper() {
        return temper;
    }

    public void setTemper(Integer temper) {
        this.temper = temper;
    }

    public Integer getSugar() {
        return sugar;
    }

    public void setSugar(Integer sugar) {
        this.sugar = sugar;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Product{" +
                "temper=" + temper +
                '}';
    }
}
