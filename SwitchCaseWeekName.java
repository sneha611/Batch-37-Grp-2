package DemoPgmOfSwitchCase;

import java.util.Scanner;

public class SwitchCaseWeekName {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Initial Letter of Weekdays (M , T , W , F , S ):");
		String initial = sc.toString();

		
		switch (initial)
		{
		case M :
			System.out.println("Monday");
			break;
			 
		}
		sc.close();
	
		

	}

}
