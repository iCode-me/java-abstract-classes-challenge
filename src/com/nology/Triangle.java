package com.nology;

public class Triangle extends Shape {

    int firstSide;
    int secondSide;
    int base;
    int height;

    public Triangle(int numOfSides, int firstSide, int secondSide, int base, int height) {
        super(numOfSides);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.base = base;
        this.height = height;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void getArea() {
        double Area = 0.5 * getHeight() * getBase();
        System.out.println("The area of a triangle is " + Area);
    }

    @Override
    public void getPerimeter() {
        int Perimeter = getFirstSide() + getSecondSide() + getBase();
        System.out.println("The perimeter of a triangle is " + Perimeter);
    }
}
