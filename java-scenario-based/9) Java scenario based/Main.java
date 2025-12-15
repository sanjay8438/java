import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    double balance = 5000;
	    System.out.print("Enter the amount :");
	    double amount = sc.nextDouble();
	    if(balance>=amount && amount%100==0)
		System.out.println("Withdraw successful");
		else
		System.out.println("Invalid Balance");
	}
}
