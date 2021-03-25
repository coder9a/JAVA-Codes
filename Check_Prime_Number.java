import java.util.Scanner;

public class Check_Prime_Number
{
    public static void main(String[] args)
    {
        int flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number ");
        int n = sc.nextInt();
        int m = n/2;
        if(n==0||n==1)
        {
            flag=1;
        }
        else
        {
            for (int i = 2; i <= m; i++)
            {
                if (n % i == 0)
                {
                    flag = 1;
                    break;
                }
            }
        }
        if(flag == 1)
        {
            System.out.println("Not Prime");
        }
        else
        {
            System.out.println("Number is prime");
        }
    }
}
