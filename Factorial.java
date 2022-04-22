package application;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Program to calculate the factorial of number 1 until number 20
		long factorial;
		int f;
		
		for (int j = 0; j < 20; j++) {
			
			fatorial = j + 1;
			f = (int) factorial;
			for (int i = j; i >= 1; i--) {
				
				factorial = factorial * i;
				
			}
		
			System.out.println("O factorial de " + f + " é igual a: " + factorial);
			
		}
		
		sc.close();
	}
}
