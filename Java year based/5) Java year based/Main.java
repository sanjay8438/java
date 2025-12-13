import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int year = sc.nextInt();
	    int month=sc.nextInt();
	    if((month<0 || month>12) && (year<=0)){
		System.out.println("Invalid year or month");
	    }
	    int[]dayinmonths={31,28,31,30,31,30,31,31,30,31,30,31};
	    if(month==2&&((year%4==0 && year%100!=0) || (year%400==0))){
	    dayinmonths[1]=29;
	    }
	    System.out.println(dayinmonths[month-1]);
		
	}
}
