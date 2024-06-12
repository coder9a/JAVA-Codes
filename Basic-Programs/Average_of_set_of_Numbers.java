import java.util.Scanner;

public class Average_of_set_of_Numbers
{
    int Average(int ... arr)
    {
        int sum=0;
        for(int i=0;i<=4;i++)
        {
            sum = sum + arr[i];
        }
        int avg = sum/5;
        return avg;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int [] num;
        num = new int[5];
        for(int i=0;i<=4;i++)
        {
            System.out.print("Enter number "+i+" ");
            num[i] = s.nextInt();
        }
        Average_of_set_of_Numbers obj = new Average_of_set_of_Numbers();
        int x = obj.Average(num);
        System.out.println("Average is "+x);
    }
}
