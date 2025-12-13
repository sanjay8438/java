import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    char ch=sc.next().charAt(0);
	    if(ch>='A' && ch<='Z')
		System.out.println("is uppercase");
		else if(ch>='a' && ch<='z')
		System.out.println("is lowercase");
	    else if(ch>='0' && ch<='9')
		System.out.println("is Digit");
		else
		System.out.println("is Symbol");
		
	}
}
