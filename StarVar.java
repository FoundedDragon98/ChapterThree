package ChapterThree;
import java.util.Scanner;

public class StarVar
{
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        //First drawing
        int firstLength = length;
        for(int i = 0; i < length; i++) {
            for(int n = 0; n < firstLength; n++) {
                System.out.print("*");
            }
            firstLength--;
            System.out.println("");
        }
        System.out.println("");
        //Second drawing
        int secondLengthA = 0;
        int secondLengthB = length;
        for(int i = 0; i < length; i++) {
            for(int n = 0; n < secondLengthB; n++) {
                System.out.print(" ");
            }
            for(int n = 0; n < secondLengthA; n++) {
                   System.out.print("*");
            }
            secondLengthA++;
            secondLengthB--;
            System.out.println("");
        }
        System.out.println("");
        //Third drawing
        int thirdLengthA = length;
        int thirdLengthB = 0;
        for(int i = 0; i < length; i++) {
            for(int n = 0; n < thirdLengthB; n++) {
                System.out.print(" ");
            }
            for(int n = 0; n < thirdLengthA; n++) {
                System.out.print("*");
            }
            thirdLengthA--;
            thirdLengthB++;
            System.out.println("");
        }
        System.out.println("");
        //Fourth drawing
        int fourthLengthA = length;
        int fourthLengthB = 1;
        int spaces = 0;
        if(length % 2 == 0) {
            spaces = ((length/2) - 1);
        }
        else {
            spaces = ((length - 1)/2);
        }
        int stars = 1;
        for(int i = 0; i < (length/2.0); i++) {
            printItem(" ", spaces);
            printItem("*", stars);
            printItem(" ", spaces);
            spaces--;
            stars += 2;
            System.out.println("");
        }
        for(int i = 0; i < (length/2.0) + 1; i++) {
            printItem(" ", spaces);
            printItem("*", stars);
            printItem(" ", spaces);
            spaces++;
            stars -= 2;
            System.out.println("");
        }
    }
    
    public static void printItem(String st, int num) {
        for(int j = 0; j < num; j++) {
            System.out.print(st);
        }
    }
}
