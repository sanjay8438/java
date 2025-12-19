import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    boolean allEven=true;
	    boolean allOdd=true;
	    while(n>0){
	        int rem=n%10;
	        
	        if(rem%2!=0)
	         allEven=false;
	         
	         if(rem%2==0)
	         allOdd=false;
	        n=n/10;
	    }
	    if(allEven)
		System.out.println("All the digit is EVEN");
		else if(allOdd)
		System.out.println("All the digit is ODD");
		else
		System.out.println("Both are mixed");
	}
}
