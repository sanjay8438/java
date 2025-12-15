import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the unit :");
	    int unit=sc.nextInt();
	    if(unit>=0 && unit<=100 )
	    System.out.println("Free");
	    else if(unit>=101 && unit<=300)
	    System.out.println("$5");
	    else
	    System.out.println("$10");
	}
}
