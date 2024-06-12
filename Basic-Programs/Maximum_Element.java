import java.util.Scanner;

public class Maximum_Element
{
    public static void main(String[] args)
    {
        int max = Integer.MIN_VALUE;
        int [] arr = {12,23,34,45,56,67,78,89,21,32};
        for(int ele:arr)
        {
            if(ele>max)
            {
                max = ele;
            }
        }
        System.out.println("Maximum element = "+max);
    }
}
