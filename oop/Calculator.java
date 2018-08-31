package com.inapp.firstjava.oop;

public class Calculator extends Addition{
	 public void multiplication(int x, int y) {
	      result = x * y;
	      System.out.println("Product is :"+result);
	      super.addition(5,10);
	   }
		
	   public static void main(String args[]) {
	      int a = 20, b = 10;
	      Calculator cal = new Calculator();
	      cal.multiplication(3, 2);
	   }
}
