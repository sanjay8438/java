import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int lenght=sc.nextInt(),breadth=sc.nextInt();
	    int perimeter = 2*(lenght+breadth);
		System.out.println(perimeter);
	}
}
