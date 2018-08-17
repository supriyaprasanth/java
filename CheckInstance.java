package com.inapp.firstjava.learn;

class Base {
	
}
class Derived extends Base {}

public class CheckInstance {
	public static void main(String args[]){
		Derived derived = new Derived() ;
		
		if(derived instanceof Derived){
			System.out.println("derived is an insatnce of Derived Class");
		}else{
			System.out.println("not an instance of Derived Class");
		}
		
		if(derived instanceof Base){
			System.out.println("is an instance of Base class");
		}else{
			System.out.println("is not an instance of Base class");
		}
		
		if(derived instanceof Object){
			System.out.println("is an instance of Object class");
		}else{
			System.out.println("is not an instance of Object Class");
		}
	}
	
}
