import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner  sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int sum=0;
	        int pro = n*n;
	    for(int temp=pro ;temp>0;temp/=10){
	     sum+=temp%10;
	    }
	    if(sum==n)
	    System.out.println( n + " is neon number");
	    else
	    System.out.println( n + " is not a neon number");
	    
}
}
