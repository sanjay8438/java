import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int speed=sc.nextInt();
	    int time=sc.nextInt();
	    
	    int distance = speed*time;
		System.out.println("Distance :" +distance+"/km");
	}
}
