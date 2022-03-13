package com.nology;

public class Rectangle extends Shape{
    int height;
    int width;

    public Rectangle(int numOfSides, int height, int width) {
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
        System.out.println("The area of a rectangle is " + Area);
    }

    @Override
    public void getPerimeter() {
        int Perimeter = (getHeight() + getWidth()) * 2;
        System.out.println("The perimeter of a rectangle is " + Perimeter);
    }
}
