import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    if((num%2==0) && (num%5==0) && num%8 !=0){
	        System.out.println("Is divisible");
	    }else{
		System.out.println("Not divisible");
	    }
	}
}
