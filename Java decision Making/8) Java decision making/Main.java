import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int num=sc.nextInt();
	    int lastdigit=num%10;
	    if(lastdigit%3==0){
	        System.out.println("Divisible by 3");
	    }else{
		System.out.println("Not Divisible by 3");
	}
	}
}
