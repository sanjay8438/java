import java.util.Scanner;

public class Main
{
    
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int totalBill = sc.nextInt();
	    int split = totalBill/3;
		System.out.println("Each mus bay :" +split);
	}
}
