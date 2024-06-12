import java.util.Scanner;

public class nth_Fibonacci_Term
{
    int Fibonacci_Term(int n)
    {
        if(n==1||n==0)
        {
            return n;
        }
        else
        {
            return Fibonacci_Term(n-1)+Fibonacci_Term(n-2);
        }
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = s.nextInt();
        nth_Fibonacci_Term obj = new nth_Fibonacci_Term();
        int x = obj.Fibonacci_Term(n);
        System.out.println(n+"th Term of Fibonacci is = "+x);
    }
}
