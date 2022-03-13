package com.nology;

public abstract class Shape {

    private int numOfSides;

    public Shape(int numOfSides) {
        this.numOfSides = numOfSides;
    }

    public int getNumOfSides() {
        return numOfSides;
    }

    public abstract void getArea();
    public abstract void getPerimeter();

}
