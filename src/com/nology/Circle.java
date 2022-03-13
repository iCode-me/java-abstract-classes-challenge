package com.nology;

public class Circle extends Shape {
    public Circle(int numOfSides) {
        super(numOfSides);
    }

    double numOfSides = 2 * Math.PI * getNumOfSides();

    @Override
    public void getArea() {
        double Area = Math.PI * getNumOfSides() * getNumOfSides();
        System.out.println("The area of circle is " + Area);
    }

    @Override
    public void getPerimeter() {
        System.out.println("The perimeter of circle is " + numOfSides);
    }


}
