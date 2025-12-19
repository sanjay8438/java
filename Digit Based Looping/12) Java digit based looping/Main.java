import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int sumEven=0;
	    int sumOdd=0;
	    while(n>0){
	        int rem=n%10;
	        
	        if(n%2==0)
	        sumEven+=rem;
	        else
	        sumOdd+=rem;
	        
	       n=n/10;
	    }
	    int diff=sumEven-sumOdd;
	    
		System.out.println("The difference is :" +diff);
	}
}
