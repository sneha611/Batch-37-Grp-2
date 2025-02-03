package Demo1;

import java.util.Scanner;

public class FirstDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
	    System.out.println("Enter First number:");
	    int a = sc.nextInt();
	    
	    System.out.println("Enter second number:");
	    int b = sc.nextInt();
	   
		System.out.println("Addition of A and B = "+(a+b));
		System.out.println("Substaction of A and B = "+(a-b));
		
		sc.close();
	}
}