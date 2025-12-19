import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sqrt= n*n;
        System.out.println(sqrt);
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
        System.out.println(rev);
        int sqrtofrev=rev*rev;
        int rev2=0;
        while(sqrtofrev!=0){
            int rem2=sqrtofrev%10;
            rev2=rev2*10+rem2;
            sqrtofrev=sqrtofrev/10;
        }
        System.out.println(rev2);
        if(sqrt==rev2)
        System.out.println("Adam number");
        else
        System.out.println("Not a Adam number");
    }
}