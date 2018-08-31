package com.inapp.firstjava.oop;

public class ArrayTest {

	public static void main(String[] args) {
		String carMakers[] = {"suzuki","wolkswagon","ford","fiat","tata","mahindra","bmw",};
		
		for(int i=0;i<carMakers.length;i++){
			System.out.println(i+" is :"+carMakers[i]);
		}
		System.out.println("\n");
		
		int j = 0;
		while(j<carMakers.length){			
			System.out.println(+j+" is :"+carMakers[j]);
			j++;
		}
		System.out.println("\n");
		
		int k=0;
		do{
			System.out.println(+k+" is :"+carMakers[k]);
			k++;
		}while(k<carMakers.length);
		
	}

}
