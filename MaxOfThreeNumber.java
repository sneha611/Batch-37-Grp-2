import java.util.Scanner;

public class MaxOfThreeNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 1st number : ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter 2nd number : ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter 3rd number : ");
		int num3 = sc.nextInt();
		
		int max ;
		if(num1 > num2 && num1 > num3)
		{
			max = num1;
		}
		else if(num2 > num1 && num2 > num3 )
		{
			max = num2 ;
		}
		else
		{
			max = num3 ;
		}
		
		System.out.println("Maximum no is " +max);
		
		sc.close();
	}

}
