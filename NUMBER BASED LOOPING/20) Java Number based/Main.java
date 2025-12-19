import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int temp=n;
	    int sum=0;
	    while(n!=0){
	        int rem=n%10;
	        sum+=rem;
	        n=n/10;
	    }
	    int rev=0;
	    int s=sum;
	    while(s!=0){
	        int rem=s%10;
	        rev=rev*10+rem;
	        s=s/10;
	    }
	    int total = sum*rev;
	    if(total==temp)
	    System.out.println("Magic number");
	    else
	    
		System.out.println("Not a magic number");
	}
}
