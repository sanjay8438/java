import java.util.Scanner;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int oa = sc.nextInt();
	    int dis = sc.nextInt();
	    int dispercentage = (oa*dis)/100;
	    int finalAmount = (oa-dispercentage);
	    System.out.println("Original Amount :" + oa);
		System.out.println("Final Amount :" + finalAmount);
	}
}
