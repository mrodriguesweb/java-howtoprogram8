package application;

import java.util.Scanner;

public class PitagorasTriple {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int side1, side2, hypotenuse, square, sqHypotenuse;
		
		//Program to show the Pitagoras triple
		for (int i = 1; i <= 500; i++) {
			
			side1 = i;
			
			for (int j = 1; j <= 500; j++) {
				
				side2 = j;
				
				for (int k = 1; k <= 500; k++) {
					
					hypotenuse = k;
					
					square = (int) (Math.pow(side1, 2) + Math.pow(side2, 2));
					sqHypotenuse = (int) Math.pow(hypotenuse, 2);
					
					if (square == sqHypotenuse) {
						System.out.println("Equals! Side1: " + i + " Side2: " + j + " Hypotenuse: " + k);
					}
					
				}
			}
		}
		
		sc.close();

	}

}
