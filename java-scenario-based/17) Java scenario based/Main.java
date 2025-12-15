import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter day name: ");
        String day = sc.nextLine().toLowerCase();
        switch (day) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                System.out.println("Weekday Ticket Price = ₹100");
                break;
            case "saturday":
            case "sunday":
                System.out.println("Weekend Ticket Price = ₹150");
                break;
            default:
                System.out.println("Invalid Day");
        }
        sc.close();
    }
}
