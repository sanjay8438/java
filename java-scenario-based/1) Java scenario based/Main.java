import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    double bill = sc.nextInt();
	    double discount = 0;
	    if(bill<1000){
	        discount=bill*0.05;
	    }
	    else if(bill<5000){
	    discount=bill*0.10;
	    }
	    else{
	        discount=bill*0.15;
	    }
	    double finalamount = bill-discount;
	    System.out.println("Enter the bill amount :" + bill);
	    System.out.println("Discount percentage :" + discount );
	    System.out.println("Finalamount :" + finalamount);
	}
}
