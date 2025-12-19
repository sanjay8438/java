import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int sqrtSum=0;
	    int cubeSum=0;
	    while(n>0){
	        int digit=n%10;
	        
	        sqrtSum=sqrtSum+digit*digit;
	        cubeSum=cubeSum+digit*digit*digit;
	    
	    n=n/10;
	    }
		System.out.println("Square of the digit :" +sqrtSum);
		System.out.println("Cube of the digit :" +cubeSum);
	}
}
