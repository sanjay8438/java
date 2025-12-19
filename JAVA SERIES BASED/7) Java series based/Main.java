import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    for(int i=1;i<=n;i++){
	        int odd=2*i-1;
	    
		System.out.print(odd +" ");
	    }
	}
}
