import java.util.Scanner;

public class DistanceConversion
{
    public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter distance in km ");
            float a = s.nextFloat();
            double m = a/0.621371;
            System.out.println("Distance in miles is " + m);
        }
}