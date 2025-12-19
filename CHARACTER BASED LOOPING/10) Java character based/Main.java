import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    char ch=sc.next().charAt(0);
       	    
       	    if(ch>='A' || ch<='Z'){
       	        char lowercase=(char)(ch+32);
       	        System.out.println("The lowercase is :" + lowercase);
       	    }else{
       	        System.out.println("Please enter the uppercase ");
       	    }
	}
}
