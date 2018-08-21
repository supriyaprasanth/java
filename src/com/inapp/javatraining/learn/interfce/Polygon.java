package com.inapp.javatraining.learn.interfce;

public abstract class Polygon implements PolygonAreaCalculatorService, PolygonPerimeterCalculatorService {
	private double[] sides;
	private int no_of_sides;

	@Override
	public double caculatePerimeter() {
		double perimeter = 0;
		if (sides != null && sides.length > 0) {
			for (int i = 0; i < sides.length; i++) {
				perimeter = perimeter + sides[i];				
			}
		}
		return perimeter;
	}

	public int no_of_sides() {
		return no_of_sides;
	}

	public void set_no_sides(int no_of_sides) {
		this.no_of_sides = no_of_sides;
	}

	public double[] getSides() {
		return sides;
	}

	public void setSides(double[] sides) {
		this.sides = sides;
	}

}