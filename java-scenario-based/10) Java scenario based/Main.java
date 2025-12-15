import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the Traffic colour :");
	    String colour = sc.next();
	    if(colour.equalsIgnoreCase("Red")){
	        System.out.println("STOP");
	    }else if(colour.equalsIgnoreCase("Orange")){
	        System.out.println("READY");
	    }else if(colour.equalsIgnoreCase("Green")){
		System.out.println("GO");
	    }else{
	        System.out.println("Invalid colour");
	    }
	}
}
