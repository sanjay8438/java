import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the passenger Age :");
	    int age = sc.nextInt();
	    if(age<=10)
		System.out.println("The ticket price is = 50ruppes");
		else if(age<=20)
	    System.out.println("The ticket price is = 100ruppes");
	    else
	    System.out.println("The ticket price is = 150ruppes");
	}
}
