package Demo1;

import java.util.Scanner;

public class RelationalOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number = ");
		int a = sc.nextInt();
			
		System.out.println("Enter Second number = ");
		int b = sc.nextInt();
		
		
		System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        sc.close();

	}

}
