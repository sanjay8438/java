import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    Character ch=sc.next().charAt(0);
	    int asciivalue = (int)ch;
	    if(asciivalue%2==0){
	        System.out.println("Even");
	    }else{
	        System.out.println("Negative");
	    }
	}
}
