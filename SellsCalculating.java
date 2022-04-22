package application;

import java.util.Scanner;

public class SellsCalculating {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double total, value, totalFinal = 0;
		int quantity, code;
		int Z;
		
		System.out.println("Sells calculator");
		System.out.println("0 to stop/ 1 to continue");
		
		do {
			
			System.out.println("Write the code and the quantity:");
			System.out.print("Code: ");
			code = sc.nextInt();
			while (code < 1 && code > 5) {
				System.out.print("Invalide code. Write again: ");
				code = sc.nextInt();
			}
			System.out.print("Quantity: ");
			quantity = sc.nextInt();
			
			switch (code) {
				case 1:
					value = 2.98;
					break;
				case 2:
					value = 4.50;
					break;
				case 3:
					value = 9.98;
					break;
				case 4:
					value = 4.49;
					break;
				case 5:
					value = 6.87;
					break;
				default:
					value = 0.0;
			}
			
			total = value * quantity;
			totalFinal += total;
			
			System.out.print("Write 1 to continue, 0 to stop: ");
			Z = sc.nextInt();
			
		} while (Z != 0);
		
		System.out.println("Final value: " + String.format("%.2f", totalFinal));
		
		
		sc.close();

	}

}