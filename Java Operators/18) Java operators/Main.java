import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    String result= (num>0)?"Positive" : (num<0)?"Negativr" : "Zero";
		System.out.println(result);
	}
}
