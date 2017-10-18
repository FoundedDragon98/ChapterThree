package ChapterThree;

import java.util.Scanner;
import java.text.NumberFormat;
public class Charge
{
    public static void main (String[] args)
    {
        double previousBalance;
        double additionalCharges;
        double interest = 0.02;
        double newBalance;
        double minimumPayment = 0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your previous balance: ");
        previousBalance = scan.nextDouble();
        System.out.println("Enter how much you spent: ");
        additionalCharges = scan.nextDouble();
        newBalance = (previousBalance + additionalCharges) * (1.00 + interest);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        System.out.println("Your new balance is: " + money.format(newBalance));
        if(newBalance <= 50) {
            minimumPayment = newBalance;
        }
        else if(newBalance > 50 && newBalance <= 300) {
            minimumPayment = 50;
        }
        else if(newBalance > 300) {
            minimumPayment = (0.20 * newBalance);
        }
        System.out.println("Your minimum amount due is: " + money.format(minimumPayment));
    }
}
