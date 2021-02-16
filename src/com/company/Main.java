package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle d1 = new Rectangle(13.20, 18.87);
        Rectangle d2 = new Rectangle();
        double ariad1 = d1.getArea();
        System.out.println("Aria primului dreptunghi este : " + ariad1); // 249.08
        double perimetrud1 = d1.getPerimeter();
        System.out.println("Perimetrul primului dreptunghi este : " + perimetrud1); //64.14
        double ariad2 = d2.getArea();
        System.out.println("Aria dreptunghiului al doilea este : " + ariad2);
        double perimetrud2 = d2.getPerimeter();
        System.out.println("Perimetrul dreptunghiului al doilea este : " + perimetrud2);
    }
}
