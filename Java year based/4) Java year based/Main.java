import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int year1=sc.nextInt(),year2=sc.nextInt();
	    if(year1%100==year2%100)
        System.out.println("Same last digit");
        else
		System.out.println("Not same last digit");
	}
}
