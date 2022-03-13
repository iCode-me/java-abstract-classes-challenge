package com.nology;

public class Circle extends Shape {

    int radius;

    public Circle(int numOfSides, int radius) {
        super(numOfSides);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    @Override
    public void getArea() {
        double Area = Math.PI * getRadius() * getRadius();
        System.out.println("The area of circle is " + Area);
    }

    @Override
    public void getPerimeter() {
        double Perimeter = 2 * Math.PI * getRadius();
        System.out.println("The perimeter of circle is " + Perimeter);
    }


}
