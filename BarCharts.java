package application;

import java.util.Scanner;

public class BarCharts {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] numbers = new int[5];
		int number;
		
		System.out.println("Write 5 numbers, that are between 1 and 30:");
		for (int i = 0; i < 5; i++) {
			
			System.out.print("Write: ");
			number = sc.nextInt();
			while (number < 1 && number > 30) {
				System.out.println("The number must be between 1 and 30!");
				System.out.print("Write: ");
				number = sc.nextInt();
			}
			
			numbers[i] = number;
			
		}
		
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			
			for (int j = 1; j <= numbers[i]; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
		}
		
		sc.close();

	}

}
