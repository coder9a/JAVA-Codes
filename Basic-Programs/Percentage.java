import java.util.Scanner;

public class Percent
{
    public static void main(String[] args)
    {
        System.out.println("Enter 5 subject marks");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st subject marks ");
        int a = s.nextInt();
        System.out.println("Enter 2nd subject marks");
        int b = s.nextInt();
        System.out.println("Enter 3rd subject marks");
        int c = s.nextInt();
        System.out.println("Enter 4th subject marks");
        int d = s.nextInt();
        System.out.println("Enter 5th subject marks");
        int e = s.nextInt();
        float x = (a+b+c+d+d+e)/5.0f;
        System.out.println("Percentage is " + x);

    }
}
