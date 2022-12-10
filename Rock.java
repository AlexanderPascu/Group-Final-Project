import java.util.Scanner;
import java.util.Random;
public class Rock
{
function getRandomInt() {
    return Math.floor(Math.random() );
}
public static void main(String[] args)
{
    String personPlay;
    String computerPlay;
    int computerInt;
    int computerWins = 0;
    int playerWins = 0;
    int tieWins = 0;
    int count = 0;
    do
    {
    Scanner scan = new Scanner(System.in);
    Random generator = new Random();
    System.out.println ("Enter R for Rock, P for Paper, S for Scissors: "); 
    personPlay = scan.next();
    personPlay = personPlay.toUpperCase();
    personPlay = personPlay + "a";
    personPlay = personPlay.substring(0,2);
    computerInt = generator.nextInt(3);
    count++;
    switch (computerInt)
    {
    case 0:
    {
    computerPlay = "R";
    break;
    }
    case 1:
    {
    computerPlay = "P";
    break;
    }
    case 2:
    {
    computerPlay = "S";
    break;
    }   
    default:
    {
    computerPlay = "will not happen";
    }}
    System.out.println ("Computer plays: " + computerPlay);
    if (personPlay.equals(computerPlay))
    {
    tieWins++;
    System.out.println("It's a tie!");
    }
    else if (personPlay.equals("RO"))
    {
        if (computerPlay.equals("S"))
    playerWins++;
    System.out.println("Rock crushes scissors. You win!!");
        if (computerPlay.equals("P"))
    computerWins++;
    System.out.println ("Paper eats rock. You lose!!");
    }
    else if (personPlay.equals("PA"))
    {
        if (computerPlay.equals("S"))
        computerWins++;
    System.out.println ("Scissor cuts paper. You lose!!");
        if (computerPlay.equals("R"))
        playerWins++;
    System.out.println ("Paper eats rock. You win!!");
    }
    else if (personPlay.equals("SC"))
    {
        if (computerPlay.equals("P"))
        playerWins++;
    System.out.println ("Scissor cuts paper. You win!!");
     if (computerPlay.equals("R"))
        playerWins++;
    System.out.println ("Rock breaks scissors. You lose!!");
    }
    else
    {
    System.out.println ("Invalid user input.");
    }
    } while (count < 10);
    if(count >= 10)
    {
                System.out.println("The Computer won "+computerWins+" times.");
                System.out.println("You won "+playerWins+" times.");
                System.out.println("There were "+ tieWins+" draws.");

}}}
