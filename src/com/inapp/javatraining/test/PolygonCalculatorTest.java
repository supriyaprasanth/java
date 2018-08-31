package com.inapp.javatraining.test;
import com.inapp.javatraining.learn.*;
import com.inapp.javatraining.learn.interfce.*;

public class PolygonCalculatorTest {	
	public static void main(String[] args) {
		PolygonCalculatorTest calculatorTest = new PolygonCalculatorTest();
		calculatorTest.testSquare();
		calculatorTest.testRectangle();
		calculatorTest.testPolygon();
	}
	public void testSquare() {
		int side = 5;
		PolygonAreaCalculatorService calculatorservice = new Square(side);
		PolygonPerimeterCalculatorService pericalculatorservice = new Square(side);
		System.out.println("\nSQUARE");
		System.out.println("\nArea : "+calculatorservice.calculateArea());
		System.out.println("Perimeter : "+pericalculatorservice.caculatePerimeter());
	}
	public void testRectangle() {
		int length = 5;
		int breadth = 10;
		PolygonAreaCalculatorService calculatorservice = new Rectangle(length,breadth);
		PolygonPerimeterCalculatorService pericalculatorservice = new Rectangle(length,breadth);
		System.out.println("\nRECTANGLE");
		System.out.println("\nArea : "+calculatorservice.calculateArea());
		System.out.println("Perimeter : "+pericalculatorservice.caculatePerimeter());
	}
	public void testPolygon() {
		int no_side = 5;
		int len_side =6;
		PolygonAreaCalculatorService calculatorservice = new RegularPolygon(no_side,len_side);
		PolygonPerimeterCalculatorService pericalculatorservice = new RegularPolygon(no_side,len_side);
		System.out.println("\nREGULAR POLYGON");
		System.out.println("\nArea : "+Math.round(calculatorservice.calculateArea()));
		System.out.println("Perimeter : "+pericalculatorservice.caculatePerimeter());
		
	}
}
