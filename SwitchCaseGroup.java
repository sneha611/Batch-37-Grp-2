package DemoPgmOfSwitchCase;

import java.util.Scanner;

public class SwitchCaseGroup {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Group No from 11 - 13: ");
		int grp = sc.nextInt();
		
		
		switch (grp)
		{
		case 11 :
			System.out.println("Group 1 : Sneha, Suhasini");
			break;
		
		case 12 : 
			System.out.println("Group 2 : Priyanka , Tanwi");
			break;
			
		case 13: 
			System.out.println("Group 3: Rohit , Surabh ,Ganesh");
			break;
			
		default :
			System.out.println("Invalid Input");
			
		}
		sc.close();
		
		

	}

}
