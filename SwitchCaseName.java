package DemoPgmOfSwitchCase;

import java.util.Scanner;

public class SwitchCaseName {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter Number from 1 to 3 ");
		int a = sc.nextInt();
		
		switch (a)
		{
		case 1 :
			System.out.println("Name : Sneha \nMobile no : 111 ");
			break;
			
		case 2 :
			System.out.println("Name : Suhasini \nMobile no : 222");
			break;
			
		case 3 :
			System.out.println("Name : Priyanka  \nMobile no : 333");
			break;
		
		default :
			System.out.println("Invalid Input");
		}
		sc.close();
			

	}

}
