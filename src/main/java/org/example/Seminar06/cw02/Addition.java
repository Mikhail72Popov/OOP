package org.example.Seminar06.cw02;

public class Addition implements CalculatorOperation{
    private Double right;
    private Double left;
    private Double result = 0.0;

    public Addition(Double right, Double left) {
        this.right = right;
        this.left = left;
    }


    public Double getRight() {
        return right;
    }

    public void setRight(Double right) {
        this.right = right;
    }

    public Double getLeft() {
        return left;
    }

    public void setLeft(Double left) {
        this.left = left;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }
}