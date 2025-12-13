public class Main
{
    public static void main(String[] args)
    {
        int number1 = 10;
        int number2 = 20;
        
        int temperoryVariable=number1;
        number1=number2;
        number2=temperoryVariable;
        System.out.println("After swap");
        System.out.println("First number =" + number1);
        System.out.println("Second number =" + number2);
    }
}