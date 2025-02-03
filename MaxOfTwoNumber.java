

import java.util.Scanner;

public class MaxOfTwoNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st numbers :");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd numbers :");
		int num2 = sc.nextInt();
		
		
		int max ;
		if (num1 > num2)
		{
			max = num1;
		}
		else 
		{
			max = num2 ;
			
		}
		
		System.err.println("Maximum no is :  " +max);
		
		sc.close();

	}

}
