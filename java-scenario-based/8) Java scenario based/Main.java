import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int Storedpin =8438;
	    System.out.print("Enter the pin :");
	    int pin = sc.nextInt();
	    if(pin==Storedpin){
		System.out.println("PIN verified");
		System.out.println("Continue Withdraw");
	    }
	    else{
	        System.out.println("Incorrect PIN");
	        System.out.println("Try correct PIN");
	    }
	}
}
