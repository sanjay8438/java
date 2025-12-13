import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int num=sc.nextInt();
	    if((num%3==0) || (num%7==0)){
	        System.out.println("Is divisible");
	    }else{
		System.out.println("Not divisible");
	    }
	}
}
