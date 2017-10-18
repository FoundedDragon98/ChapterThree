package ChapterThree;

// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay = "";  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play
        String result = "";
        Random generator = new Random();
        Scanner scan = new Scanner(System.in);
        //Get player's play -- note that this is stored as a string
        System.out.println("Choose R, P, or S");
        personPlay = scan.next();
        //Generate computer's play (0,1,2)
        computerInt = generator.nextInt(3);
        //Translate computer's randomly generated play to string
        if(computerInt == 0) {
            computerPlay = "R";
        }
        else if(computerInt == 1) {
            computerPlay = "P";
        }
        else if(computerInt == 2) {
            computerPlay = "S";
        }
        //Print computer's play
        System.out.println("Computer plays: " + computerPlay);
        //See who won.
        if(personPlay.equals("R") && computerPlay.equals("R")) {
            System.out.print("Rock can't crush rock, so it's a tie!");
        }
        else if(personPlay.equals("R") && computerPlay.equals("P")) {
            System.out.println("Paper covers rock, so Computer wins!");
        }
        else if(personPlay.equals("R") && computerPlay.equals("S")) {
            System.out.println("Rock crushes scissors, so Player wins!");
        }
        else if(personPlay.equals("P") && computerPlay.equals("R")) {
            System.out.println("Paper covers rock, so Player wins!");
        }
        else if(personPlay.equals("P") && computerPlay.equals("P")) {
            System.out.print("Paper can't cover paper, so it's a tie!");
        }
        else if(personPlay.equals("P") && computerPlay.equals("S")) {
            System.out.println("Scissors cuts paper, so Computer wins!");
        }
        else if(personPlay.equals("S") && computerPlay.equals("R")) {
            System.out.println("Rock crushes scissors, so Computer wins!");
        }
        else if(personPlay.equals("S") && computerPlay.equals("P")) {
            System.out.println("Scissors cuts paper, so Player wins!");
        }
        else if(personPlay.equals("S") && computerPlay.equals("S")) {
            System.out.print("Scissors can't cut scissors, so it's a tie!");
        }
    }
}