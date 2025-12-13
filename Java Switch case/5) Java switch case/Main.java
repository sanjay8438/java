import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    double balance = 10000;
	    System.out.println("==== Mini ATM ====");
	    System.out.println(" 1).Check balance ");
	    System.out.println( "2).Deposit");
	    System.out.println("3).Withdraw");
	    System.out.println("4).Exist");
	    
		System.out.print("Choice your option :");
			    int choice = sc.nextInt();

		switch(choice){
		    case 1:
		        System.out.println("Your balance is :"+ balance);
		        break ;
		        case 2:
		            System.out.print("Enter the deposit Amount :");
		            double deposit = sc.nextDouble();
		            balance = balance+deposit;
		            System.out.println("Deposit successful");
		            System.out.println("Updated balance :" + balance);
		            break ;
		            case 3:
		                System.out.print("Enter Withdraw Amount :");
		                double withdraw = sc.nextDouble();
		                if(withdraw<=balance){
		                balance = balance-withdraw;
		                System.out.println("collect the cash");
		                System.out.println("Remaining balance :" + balance);
		                }else{
		                System.out.println("Invalid balance");
		                }
		                break;
		                case 4:
		                    System.out.println("Thanks to you ATM");
		}
		sc.close();
	}
}
