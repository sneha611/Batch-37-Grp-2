package Demo1;

import java.util.Scanner;

public class SwapTwoNum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st Number : ");
		int a = sc.nextInt();
		
		System.out.println("Enter 2nd Number : ");
		int b = sc.nextInt();
		
		int temp = a ;
		a = b ;
		b = temp ;
		
		System.out.println("After Swap ");
		
		System.out.println("First no is :" +a);
		
		System.out.println("second no is : "+b);
		
		sc.close();
		
		
		

	}

}
