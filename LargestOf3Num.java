import java.util.Scanner;

public class LargestOf3Num {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,c ;
		
		System.out.println("Enter first no :");
		
	    a = sc.nextInt();
	    
	    System.out.println("Enter second no ");
		
	    b=sc.nextInt();
	    
	    System.out.println("Enter third no ");
	    
	    c=sc.nextInt();
	    
	    
	    if (a>b && b<c)
	    {
	    	System.out.println("First No is largest number");
	    }
	    
	    else if (b>c)
	    {
	    	System.out.println("Second no is largest no ");
	    }
	    
	    else
	    {
	    	
	    	System.out.println("Third no is largest no");
	    }
	    sc.close();
	}

}
