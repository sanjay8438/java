import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc= new Scanner(System.in);
	    int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),d=sc.nextInt();
	    if(a==b || b==c || c==d)
		System.out.println("square");
		else if(a==c || b==d)
		System.out.println("Rectangle");
		else
		System.out.println("Either square or rectangle");
	}
}
