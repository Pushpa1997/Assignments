package org.assignements;

public class PrimeNumbers {
	
	public static void main(String[] args) {
		
		int n=5;
		
		boolean prime=true;
		
		for (int i = 2; i <= n-1; i++) {
			
			if (n%i==0) {
				
				prime=false;
				
				System.out.println("Not prime");
				break;
				
			}
			
			
		}
		
		System.out.println(prime);
		
	}

}
