import java.util.Scanner;

public class Prime_Number_Sum
{
    public static void main(String[] args)
    {
        int count = 0,sum=0,num,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit ");
        int n1 = sc.nextInt();
        System.out.println("Enter upper limit ");
        int n2 = sc.nextInt();
            for(num=n1;num<=n2;num++)
            {
                count = 0;
                for (j = 2; j <= num/2; j++)
                {
                    if (num%j == 0)
                    {
                        count++;
                        break;
                    }
                }
                if(count ==0 && num != 1)
                {
                    sum=sum+num;
                    System.out.println(num+" ");
                }
            }
            System.out.println("Sum is : "+sum);
    }
}

