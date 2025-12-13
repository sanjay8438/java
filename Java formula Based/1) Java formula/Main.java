import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int lenght =sc.nextInt();
	    int breadth =sc.nextInt();
	    int area = lenght * breadth;
		System.out.println("area of Rectangle :"+area);
	}
}
