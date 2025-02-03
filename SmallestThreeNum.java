import java.util.Scanner;

public class SmallestThreeNum {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter 1st No :");
		int a = sc.nextInt();
		
		System.out.println("Enter 2nd No : ");
		int b= sc.nextInt();
		
		System.out.println("Enter 3rd No :");
		int c = sc.nextInt();
		
		
		int smallest;
		
		if(a<=b && a<=c)
		{
			smallest = a;
		}
		else if (b<=a && b<=c)
		{
			smallest = b;
		}
		else 
		{
			smallest = c;
		}
		
		System.out.println("Smallest no is : "+smallest);
		sc.close();

	}

}
