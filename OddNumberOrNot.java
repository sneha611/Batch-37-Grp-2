import java.util.Scanner;

public class OddNumberOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a No :");
		int num = sc.nextInt();
		
		if (num % 2 != 0 )
		{
			System.out.println("Given no is add");
		}
		
		else
		{
			System.out.println("Given no is Even");
		}
		sc.close();
	}

}
