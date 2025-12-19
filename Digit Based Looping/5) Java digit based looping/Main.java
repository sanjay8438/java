import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    boolean ascending=true;
	    int temp=10;
	    while(n>0){
	        int rem=n%10;
	        if(rem>temp){
	        ascending=false;
	        break;
	    }
	       temp=rem;
	    n=n/10;
	    }
	 
	    if(ascending)
		System.out.println("It is in ascending order ");
		else
		System.out.println("It is not in ascending order ");
	}
}
