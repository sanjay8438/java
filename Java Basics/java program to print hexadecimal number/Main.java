import java.util.Scanner;

public class Main{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int decimalNumber = scanner.nextInt();
        String hexadecimalString = Integer.toHexString(decimalNumber);
        System.out.println(hexadecimalString);
        scanner.close();
    }
}