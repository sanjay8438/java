import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the vehicle speed(km/h) :");
	    int speed=sc.nextInt();
	    if(speed>100)
		System.out.println("Vehicle speed Exceeds");
		else
		System.out.println("speed is within the limit");
	}
}
