package com.inapp.javatraining.learn;

public class Square extends Rectangle {

	public Square() {
		System.out.println("Constructor of square)");
	}

	public Square(double sidelength) {
		super(sidelength, sidelength);
	}
}