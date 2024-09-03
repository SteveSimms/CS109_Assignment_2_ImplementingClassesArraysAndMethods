package org.example;

public class Cube {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double calculateVolume() {
        return Math.pow(side, 3);
    }
}