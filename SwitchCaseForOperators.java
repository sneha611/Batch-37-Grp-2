package DemoPgmOfSwitchCase;

import java.util.Scanner;

public class SwitchCaseForOperators {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Second Number : ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter Operator: + , - , * , / ");
		int operator = sc.next().charAt(0);
		
		
		switch ( operator ) {
		
	
		
		case '+' :
			System.out.println("Addition of number is : " + (num1 + num2) );
			break ;
			
		case '-' :
			System.out.println("Substraction of number is :" + (num1 - num2));
			break ;
			
		case '*' :
			System.out.println("Multiplication of number is : " + (num1 * num2)  );
			break;
			
		/* case ' / ' :
			System.out.println("Division of number is " + (num1 / num2) );
			break ; */
			
		default :
			System.out.println("Invalid operator");
	
		}
		sc.close();
		
		
		

	}

}
