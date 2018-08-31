package com.inapp.javatraining.learn;

import com.inapp.javatraining.learn.interfce.Polygon;

public class RegularPolygon extends Polygon {
	private int no_sides;
	private double length_side;
	private double set_side[];


	public RegularPolygon(int noofsides, double sidelength) {
		no_sides = noofsides;
		length_side = sidelength;
		set_side = new double[noofsides];
		for (int i = 0; i < set_side.length; i++) {
			set_side[i]=length_side;
		}
		setSides(set_side);
	}
	

	@Override
	public double calculateArea() {
		return (no_sides * (length_side * length_side)) / (4.0 * Math.tan((Math.PI / no_sides)));
	}
	
	
	
}