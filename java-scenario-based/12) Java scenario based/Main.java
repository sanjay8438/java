import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the temperature c:");
	    int temp = sc.nextInt();
	    if(temp<=10)
	    System.out.println("Cold");
	    else if(temp<=25)
	    System.out.println("Plesant");
	    else if(temp<=35)
	    System.out.println("Hot");
	    else
	    System.out.println("Heatwave");
	}
}
