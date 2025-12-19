import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int sum=0;
	    int a=n*n;
	    while(a!=0){
	        int rev=0;
	        int rem=a%10;
	        rev=rev*10+rem;
	        a=a/10;
	    
	    sum+=rev;
	    }
	    if(n==sum)
		System.out.println(" It is neon number");
		else
		System.out.println("It is not neon number");
	}
}
