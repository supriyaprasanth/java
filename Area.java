package com.inapp.firstjava.util;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Area {
	public static void main(String args[]){
		Rectangle rectangle = new Rectangle(10.05, 5);
		Circle circle = new Circle(5.66);
		Triangle triangle = new Triangle(5.0, 10.2);
        System.out.println("Area of rectangle = " + rectangle.calculateAreaOfRectangle());
        System.out.println("Perimeter of rectangle = " + rectangle.calculatePerimeterOfRectangle());
        System.out.println("\nArea of circle = " + circle.calculateAreaOfCircle());
        System.out.println("Circumference = " + circle.calculateCircumferenceOfCircle());
        System.out.println("\nArea of Triangle = " + triangle.calculateAreaOfTriangle());
	}
}

class Rectangle{
    double length,breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    double calculateAreaOfRectangle(){
    	NumberFormat numberFormatter = new DecimalFormat("#0.00");
        return Double.parseDouble(numberFormatter.format(length * breadth));
    }
    double calculatePerimeterOfRectangle(){
        NumberFormat numberFormatter = new DecimalFormat("#0.00");
        return Double.parseDouble(numberFormatter.format(2 * (length + breadth)));
    }
}

class Circle{
    double radius;
    static final double pie=3.14;
    Circle(double radius){
        this.radius = radius;
    }
    double calculateAreaOfCircle(){
    	NumberFormat numberFormatter = new DecimalFormat("#0.00");
        return Double.parseDouble(numberFormatter.format(pie * radius * radius));
    }
    double calculateCircumferenceOfCircle(){
    	NumberFormat numberFormatter = new DecimalFormat("#0.00");
        return Double.parseDouble(numberFormatter.format(2 * pie * radius));
    }
}

class Triangle {
	double base,height;
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	double calculateAreaOfTriangle(){
		NumberFormat numberFormatter = new DecimalFormat("#0.00");
        return Double.parseDouble(numberFormatter.format(0.5 * base * height));
	}
}
