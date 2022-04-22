import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//First default
		for (int i = 1; i <= 10; i++) {
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print('*');
				
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		
		//Second default
		for (int i = 1; i < 10; i++) {
			
			for (int j = 10; j >= i; j--) {
				
				System.out.print('*');
				
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		
		//Third default
		for (int i = 1; i <= 10; i++) {
			
			if (i >= 2) {
				for (int k = 1; k < i; k++) {
					
					System.out.printf("%1s", ' ');
					
				}
			}
			
			for (int j = 10; j >= i; j--) {
				
				System.out.print('*');
				
			}
			
			System.out.println();
			
		}
		
		System.out.println();
		
		//Fourth default
		for (int i = 1; i <= 10; i++) {
			
			for (int k = 9; k >= i; k--) {
					
					System.out.printf("%1s", ' ');
					
			}
			
			
			for (int j = 1; j <= i; j++) {
				
				System.out.print('*');
				
			}
			
			System.out.println();
			
		}
		
		sc.close();

	}

}