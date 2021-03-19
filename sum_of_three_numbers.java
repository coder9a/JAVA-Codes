import java.util.Scanner;

public class sum_of_three
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        int a = s.nextInt();
        System.out.println("Enter 2nd number ");
        int b = s.nextInt();
        System.out.println("Enter 3rd number");
        int c = s.nextInt();
        int x = (a+b+c);
        System.out.println("Percentage is " + x);

    }
}
}
