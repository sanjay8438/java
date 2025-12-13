import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int amount = sc.nextInt();
	    int num2000 = amount/2000;
	    amount = amount%2000;
	    int num500 = amount/500;
	    amount = amount%500;
	    int num100 = amount/100;
		System.out.println(num2000);
		System.out.println(num500);
		System.out.println(num100);
	}
}
