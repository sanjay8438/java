import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n=0;
	    int sum=0;
	    while(true){
	        n=sc.nextInt();
	        if(n<0){
	            break;
	        } 
	        sum+=n;
	        
	    }
	    System.out.println("The sum of the postive number is :"+sum);
	    
	}
}
