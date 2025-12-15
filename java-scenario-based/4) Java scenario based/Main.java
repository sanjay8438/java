import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int percentage = sc.nextInt();
	    if(percentage==100)
		System.out.println("Batter full");
		else if(percentage<=50 && percentage>40)
		System.out.println("50% consumed");
		else if(percentage<=20 && percentage>1)
		System.out.println("Low battery");
		else
		System.out.println("Power off");
	}
}
