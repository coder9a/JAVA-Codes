import java.util.Scanner;

public class Recursive_Numbers_Sum
{
    int Recursive_Sum(int n)
    {
        if(n == 1)
        {
            return 1;
        }
        else
        {
            return n+Recursive_Sum(n-1);
        }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = s.nextInt();
        Recursive_Numbers_Sum obj = new Recursive_Numbers_Sum();
        int sum = obj.Recursive_Sum(n);
        System.out.println("Sum upto"+ n +" numbers is = "+sum);
    }
}
