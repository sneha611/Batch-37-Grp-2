package Demo1;

import java.util.Scanner;

public class SwapWithoutThirdVariable {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter first no :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter second no :");
		int num2 = sc.nextInt();
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		
		System.out.println("********************************");
		System.out.println("After Swapping");
		System.out.println("First no is " +num1);
		System.out.println("Second no is " +num2);
		
		sc.close();
	

	}

}
