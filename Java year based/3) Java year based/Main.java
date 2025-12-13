import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc =new Scanner(System.in);
	    int year=sc.nextInt();
	    if(year/100==year%100)
		System.out.println("Is equal");
		else
		System.out.println("Is not equal");
	}
}
