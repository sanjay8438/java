import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data usage percentage: ");
        int usage = sc.nextInt();

        if (usage <= 40) {
            System.out.println(" 20% consumed");
        }
        else if (usage <= 80) {
            System.out.println("Half Consumed");
        }
        else {
            System.out.println("Data Over");
        }
    }
}
