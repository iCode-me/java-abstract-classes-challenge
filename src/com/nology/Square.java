package com.nology;

public class Square extends Shape {

    int height;
    int width;

    public Square(int numOfSides, int height, int width) {
        super(numOfSides);
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void getArea() {
        int Area = getHeight() * getWidth();
        System.out.println("The area of a square is " + Area);
    }

    @Override
    public void getPerimeter() {
        int Perimeter = getNumOfSides() * getHeight();
        System.out.println("The perimeter of a square is " + Perimeter);
    }
}
