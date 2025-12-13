import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int price = sc.nextInt();
	    int buy = sc.nextInt();
	    int group = buy/5;
	    int remaining = group%5;
	    int penstopay = (group*3)+remaining;
	    int total = penstopay*price;
		System.out.println("Pens to pay :" + penstopay);
		System.out.println("Total Amount :" + total);
	}
}
