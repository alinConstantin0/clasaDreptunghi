package com.company;

public class Rectangle {
    private double lungime = 1.00;
    private double latime = 1.00;

    public Rectangle() {
    }

    public Rectangle(double lung, double lat) {
        this.lungime = lung;
        this.latime = lat;
    }

    public double getArea() {
        double aria = this.lungime * this.latime;
        return aria;
    }
    public double getPerimeter() {
        double perimetru = (this.lungime * 2) + (this.latime * 2);
        return perimetru;
    }
}
