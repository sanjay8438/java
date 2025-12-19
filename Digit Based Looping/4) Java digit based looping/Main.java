import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the digit :");
	    int n=sc.nextInt();
	    System.out.print("Enter the number to count :");
	    int d=sc.nextInt();
	    int count=0;
	    while(n>0){
	        int rem=n%10;
	        if(rem==d){
	            count++;
	        }
	        n=n/10;
	    }
	  
		System.out.println("Number of time occured :" +count);
	}
}
