import java.util.Scanner;

public class DivisibleBySix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter No :");
		int num = sc.nextInt();
		
		
		if (num % 6 == 0)
		{
			System.out.println("Number is divisble by 6 ");
		}
		
		else
		{
			System.out.println("Number is not divisble by 6");
		}
		sc.close();
	}

}
