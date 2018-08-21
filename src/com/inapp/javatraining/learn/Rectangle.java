package com.inapp.javatraining.learn;

import com.inapp.javatraining.learn.interfce.Polygon;

public class Rectangle extends Polygon {
	private double length;
	private double breadth;
	private double area;
	private double perimeter;
	private boolean square;

	public Rectangle() {
		System.out.println("Constructor Rectangle()");
	}

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
		double[] sides = { length, breadth, length, breadth };
		setSides(sides);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
		isSquare();
	}

	public double getBreadth() {
		return breadth;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
		isSquare();

	}

	public double getArea() {
		return area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public boolean isSquare() {
		square = breadth == length;
		return square;
	}

	@Override
	public double calculateArea() {

		return length * breadth;
	}

}