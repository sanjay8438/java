import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int num=sc.nextInt();
	    if((num>100) && (num<999)){
	        System.out.println( "is 3 digit");
	    }else{
		System.out.println(  "Not 3 digit");
	    }
	}
}
