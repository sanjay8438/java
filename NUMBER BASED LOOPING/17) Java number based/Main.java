import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int sum=0;
	    while(n!=0){
	        int rem=n%10;
	        sum+=rem;
	        n=n/10;
	    }
	    if(n/sum==n)
		System.out.println("It is Harshad number");
		else
		System.out.println("It is not a Harshad number");
	}
}
