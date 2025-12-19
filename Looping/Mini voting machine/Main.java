import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int party1=0,party2=0,party3=0,party4=0;
	   
	    
	    System.out.println("----Voting machine----");
	    System.out.println(" 1: BJP");
	    System.out.println(" 2: TVK");
	    System.out.println(" 3: DMK");
	    System.out.println(" 4: ADMK");
	    System.out.println(" If -1 voting Ends");
	   while(true){
	    System.out.print("\nEnter your vote :");
	    int vote = sc.nextInt();
	    if(vote==-1){
	        break;
	    }
	    switch(vote){
	        case 1:
	            party1++;
	            break;
	            case 2:
	                party2++;
	                break;
	                case 3:
	                    party3++;
	                    break;
	                    case 4:
	                        party4++;
	                        break;
	                        default :
	                        System.out.println("Invalid party");
	    }
	                        
	    }
	    System.out.println(" BJP :" + party1);
	    System.out.println(" TVK :" + party2);
	    System.out.println(" DMK :" + party3);
	    System.out.println(" ADMK :" + party4);
	    
	  	}
}
