package DemoPgmOfSwitchCase;

import java.util.Scanner;

public class NameOfDayAndMonth {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number (1-7) to show Name of Day :");
		int dayno = sc.nextInt();
		
		switch (dayno)
		{
		
		case 1 : 
			System.out.println("Monday");
			break;
			
		case 2 :
			System.out.println("Tuesday");
			break;
			
		case 3 :
			System.out.println("Wednesday");
			break;
			
		case 4 :
			System.out.println("Thursday");
			break;
			
		case 5 :
			System.out.println("Friday");
			break;
			
		case 6 :
			System.out.println("Saturday");
			break;
			
		case 7 :
			System.out.println("Sunday");
			break;
		

	}
		
		System.out.println("\nEnter Month (1-12)");
		int monthnum = sc.nextInt();
		
		switch (monthnum)
		{
		case 1 :
			System.out.println("January");
			break;
			
		case 2 :
			System.out.println("February");
			break;
			
		case 3 :
			System.out.println("March");
			break;
			
		case 4 :
			System.out.println("April");
			break;
			
		case 5 :
			System.out.println("May");
			break;
			
		case 6 :
			System.out.println("Jun");
			break;
			
		case 7 :
			System.out.println("July");
			break;
			
		case 8 :
			System.out.println("Augest");
			break;
			
		case 9 :
			System.out.println("September");
			break;
			
		case 10 :
			System.out.println("Octomber");
			break;
			
		case 11 :
			System.out.println("November");
			break;
			
		case 12 :
			System.out.println("December");
			break;
			
		}
		
		
				
		sc.close();

}
}

