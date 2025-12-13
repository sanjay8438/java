import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter integer :");
        int decimalNumber = scanner.nextInt();
        String hexaString = Integer.tohexaString(decimalNumber);
        System.out.println(hexaString);
        scanner.close();
    }
}