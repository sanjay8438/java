import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int sqrt = n*n;
	    int last=n%10;
	    int sqrtlast=last*last;
	    int lastsqrt=sqrt%100;
	    if(lastsqrt==sqrtlast)
	    System.out.println("It is Automorphic Number");
	    else
		System.out.println("Not a Automorphic Number");
	}
}
