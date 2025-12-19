import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    boolean descending=true;
	    int temp=-1;
	    while(n>0){
	        int rem=n%10;
	        if(rem<temp){
	        descending=false;
	        break;
	    }
	       temp=rem;
	    n=n/10;
	    }
	 
	    if(descending)
		System.out.println("It is in descending order ");
		else
		System.out.println("It is not in descending order ");
	}
}
