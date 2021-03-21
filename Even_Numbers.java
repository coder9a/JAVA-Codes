import java.util.Scanner;

public class Even_Numbers
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number upto which you have to print even numbers");
        int n = s.nextInt();
        int i=0;
        while(i<=n)
        {
            System.out.println(i);
            i = i+2;
        }
    }
}
