import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n=153;
	    int temp=n;
	    int a=n%10;
	    int b=a*a*a;
	    System.out.println(b);
	    n=n/10;
	    int c=n%10;
	    int d=c*c*c;
	    System.out.println(d);
	    n=n/10;
	    int e=n%10;
	    int f=e*e*e;
	    System.out.println(f);
	    int g=b+d+f;
	    if(g==temp)
	    System.out.println("Armstrong number");
	    else
		System.out.println("Not a armstrong number");
	}
}
