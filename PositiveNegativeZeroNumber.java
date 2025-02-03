import java.util.Scanner;

public class PositiveNegativeZeroNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a no :");
		int no = sc.nextInt();
		
		if(no > 0)
		{
			System.out.println(no + " is postive number");
		}
		else if (no < 0)
		{
			System.out.println(no + " is negative number");
		}
		else 
		{
			System.out.println("The number is zero");
		}
		sc.close();

	}

}
