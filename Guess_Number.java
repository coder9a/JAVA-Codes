import java.security.SecureRandomSpi;
import java.util.Random;
import java.util.Scanner;

class Game
{
    int number;
    int noOfGuesses;
    int inputNumber;
    public Game()
    {
        Random random = new Random();
        number = random.nextInt(100);
    }
    public void takeUserInput()
    {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    public int getNoOfGuesses()
    {
        return noOfGuesses;

    }
    public void setNoOfGuesses(int noOfGuesses)
    {
        this.noOfGuesses = noOfGuesses;
    }
    boolean isCorrectNumber()
    {
        noOfGuesses++;
        if(inputNumber == number)
        {
            System.out.println("Yes, you guessed it right in "+noOfGuesses+" attempts");
            return true;
        }
        else if(inputNumber<number)
        {
            System.out.println("Too low");
        }
        else
        {
            System.out.println("Too high");
        }
        return false;
    }
}
public class Guess_Number
{
    public static void main(String[] args)
    {
        Game myGame = new Game();
        boolean result = false;
        while(!result)
        {
            myGame.takeUserInput();
            result = myGame.isCorrectNumber();;
        }
    }
}
