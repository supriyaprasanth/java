package com.inapp.firstjava.learn;

class Base {
	
}
class Derived extends Base {}

public class CheckInstance {
	public static void main(String args[]){
		Base base = new Base();
		Derived derived = new Derived() ;
		Derived d=null;
	 
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
		
		if(d instanceof Derived){
			System.out.println("d is an instance of Derived class");
		}else{
			System.out.println("d is not an instance of Derived class");
		}
		
		if(base instanceof Derived){
			System.out.println("base is an instance of Derived Class");
		}else{
			System.out.println("base is not an instance of Derived Class");
		}
	}
	
}
