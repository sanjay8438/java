import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the mark :");
	    int mark=sc.nextInt();
	    if(mark>=35)
		System.out.println("Pass");
		else
		System.out.println("Fail");
	}
}
