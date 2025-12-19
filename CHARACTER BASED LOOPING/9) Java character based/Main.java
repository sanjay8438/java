import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int decimal=0;
	    int power=0;
	    while(n>0){
	        int rem=n%10;
	        decimal=decimal+rem*(int)Math.pow(2,power);
	        power++;
	        n=n/10;
	    }
		System.out.println("The decimal Number is :" +decimal);
	}
}
