import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int k=(int)Math.sqrt(n);
	    if(k*k==n)
	    System.out.println("It is perfect square");
	    else
		System.out.println("It is not perfect square");
	}
}
