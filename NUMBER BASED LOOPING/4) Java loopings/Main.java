import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int product=1;
	    while(n!=0){
	        int rem=n%10;
	        product=product*rem;
	        n=n/10;
	    }
	    
		System.out.println( "The product of the given digit is :" +product);
	}
}
