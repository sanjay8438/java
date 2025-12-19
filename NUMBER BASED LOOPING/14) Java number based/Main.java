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
	        int fact=1;
	        for(int i=1;i<=rem;i++){
	            fact=fact*i;
	        }     
	    sum+=fact;
	    n=n/10;
	        
	    }
	    if(sum==temp)
		System.out.println("It is strong number");
		else
		System.out.println("It is not perfect number");
	}
}
