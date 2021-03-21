import java.util.Scanner;

public class Array_Sum_Avg
{
    public static void main(String[] args)
    {
        int sum = 0;
        int [] arr = {12,23,34,45,56,67,78,89,21,32};
        Scanner s = new Scanner(System.in);
        for(int ele:arr)
        {
            sum = sum + ele;
        }
        float avg = (float) sum/10;
        System.out.println("Average marks = "+avg);
    }
}
