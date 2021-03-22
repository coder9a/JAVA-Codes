import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int computerInput = random.nextInt(3);
        System.out.println("0 for Rock, 1 for Paper and 2 for Scissor");
        System.out.println("Enter user Input");
        int userInput = sc.nextInt();
        if(computerInput == userInput)
        {
            System.out.println("DRAW");
        }
        else if(computerInput == 0 && userInput == 1 || computerInput == 2 && userInput == 0 ||
                computerInput == 1 && userInput == 2)
        {
            System.out.println("You Win!");
        }
        else
        {
            System.out.println("Computer Wins!");
        }
        if(computerInput == 0)
        {
            System.out.println("Computer Choice : Rock");
        }
        else if (computerInput == 1)
        {
            System.out.println("Computer Choice : Paper");
        }
        else
        {
            System.out.println("Computer Choice : Scissor");
        }
    }
}
