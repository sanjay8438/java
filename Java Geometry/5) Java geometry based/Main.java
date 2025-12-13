import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc= new Scanner(System.in);
	    int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
	    if(a>0 && b>0 && c>0&& a+b>c && a+c>b && c+b>a)
	    System.out.println("Valid triangle");
	    else
	    System.out.println("Not valid tirangle");
	}
}
