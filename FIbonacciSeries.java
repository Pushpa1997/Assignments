package org.assignements;

public class FIbonacciSeries {
	
	public static void main(String[] args) {
		
		
		int a = 0;
		
		int b=1;
		
		int c;
		
		for (int i = 0; i < 11; i++) {
			
			System.out.print(a+" ");
			
			c=a+b;
			
			a=b;
			
			b=c;
			
		}
	}

}
