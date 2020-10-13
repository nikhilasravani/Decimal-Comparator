import java.util.Scanner;
public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1,double num2){
        num1 = num1*1000;
        num2 = num2 *1000;
        return (int) num1 == (int) num2;

    }
    public static void main(String [] args)
    {
        Scanner number1 = new Scanner(System.in);
        System.out.println("Enter 1st decimal number:  ");
        double num1 = number1.nextDouble();

        Scanner number2 = new Scanner(System.in);
        System.out.println("Enter 2nd decimal number:  ");
        double num2 = number2.nextDouble();

        boolean val = areEqualByThreeDecimalPlaces(num1,num2);
        if(val){
            System.out.println(num1 +" = "+num2);
        }
        else
        {
            System.out.println(num1+" != "+num2);
        }
    }
}
