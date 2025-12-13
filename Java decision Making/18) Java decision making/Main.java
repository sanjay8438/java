import java.util.Scanner;

public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int num=sc.nextInt();
	    if((num>0) && (num<10)){
	        System.out.println("Single digit");
	    }else if((num>9) && (num<100)){
	        System.out.println("Two digit");
	    }else if((num>99) && (num<1000)){
	        System.out.println("Three digit");
	    }else{
		System.out.println("More than three");
	    }
	}
}
