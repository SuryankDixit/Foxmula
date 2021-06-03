package com.foxmula.assignment3;

import java.util.Scanner;

class NumberException extends Exception{
	
	public NumberException(String message) {
		super(message);
	}
}


public class ValidInvalidNumber {
	
	public static boolean isPrime(int number) {
		for(int i=2; i<= Math.sqrt(number); i++) {
			if( number%i==0)
				return false;
		}
		return true;
	}
	
	public static void isValid(int number) {
		
		try {	
			if( number>2 && ValidInvalidNumber.isPrime(number)) 	/* Even numbers are not Prime except 2 */ 
				throw new NumberException("Number is Invalid");
			
			System.out.println("Valid");
			
		}catch(NumberException e){
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		
		System.out.print("Enter Number to Check its Validity : "); 
		Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        
        ValidInvalidNumber.isValid(number);
        in.close();
	}
}