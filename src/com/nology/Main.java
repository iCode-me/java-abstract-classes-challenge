package com.nology;

public class Main {

    public static void main(String[] args) {
	 Circle circle = new Circle(1, 3);
     Rectangle rectangle = new Rectangle(4, 5,10);
     Square square = new Square(4, 2, 2);
     Triangle triangle = new Triangle(3, 4, 5, 7, 11);

     circle.getArea();
     circle.getPerimeter();

     square.getArea();
     square.getPerimeter();

     rectangle.getArea();
     rectangle.getPerimeter();

     triangle.getArea();
     triangle.getPerimeter();
    }
}
