package com.company;

public class Arch extends Circle {
    private double angle;

    public Arch(double radius, double angle) {
        super(radius);
        this.angle = angle;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(super.radius, 2) * angle / 360;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * super.radius * angle / 360;
    }
}
