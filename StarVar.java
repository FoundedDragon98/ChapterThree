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
        int secondLength = 1;
        for(int i = 0; i < length; i++) {
            for(int n = 0; n < secondLength; n++) {
                System.out.print("*");
            }
            secondLength++;
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
        for(int i = 0; i < length; i++) {
            
        }
    }
}
