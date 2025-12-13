import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int cakeperhour = sc.nextInt();
	    int totalhour = sc.nextInt();
	    int cakesmade = cakeperhour*totalhour;
	    
		System.out.println("Cakesmade :" + cakesmade);
	}
}
