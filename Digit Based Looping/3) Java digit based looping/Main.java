import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int d=sc.nextInt();
	    boolean found=false;
	    while(n>0){
	        int rem=n%10;
	       if(rem==d){
	       found=true;
	       break;
	    }
	    n=n/10;
	    } 
	   
	    if(found)
	    System.out.println("Digit is occured");
	    else
	    System.out.println("Digit is not occured");
	}
}
