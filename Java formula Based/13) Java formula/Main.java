import java.util.Scanner;
public class Main


{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int l=sc.nextInt();
	    int w=sc.nextInt();
	    int h=sc.nextInt();
	    int s=2*(l*h + l*w + w*h);
	    int v=l*h*w;
		System.out.println(s);
		System.out.println(v);
	}
}
