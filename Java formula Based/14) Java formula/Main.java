import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    double r = sc.nextDouble();
	    double sphere = 4*Math.PI*r*r;
	    double volume = (0.4/0.3)*Math.PI*r*r*r;
		System.out.println(sphere);
		System.out.println(volume);
	}
}
