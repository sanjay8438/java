import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int sumeven=0;
	    int sumodd=0;
	    for(int i=1;i<=n;i++){
	        if(i%2==0){
	            sumeven+=i;
	        }else{
	            sumodd+=i;
	        }
	    }
		System.out.println("The sum of Even numbers till N :"+ sumeven);
		System.out.println("The sum of Odd numbers till N :"+ sumodd);
	}
}
