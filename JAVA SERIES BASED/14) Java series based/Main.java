import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter how many positive numbers :");
	    int N=sc.nextInt();
	    System.out.print("Enter number :");
	    int sum=0;
	    int count=0;
	    while(N>count){
	        int n=sc.nextInt();
	        if(n<0){
	            System.out.print(" The negative number is entered , Enter positive Number.");
	            continue;
	        }
	        sum+=n;
	        count++;
	    }
	    
		System.out.println(sum);
	}
}
