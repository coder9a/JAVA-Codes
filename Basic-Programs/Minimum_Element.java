import java.util.Scanner;

public class Minimum_Element
{
    public static void main(String[] args)
    {
        int min = Integer.MAX_VALUE;
        int [] arr = {12,23,34,45,56,67,78,89,21,32};
        for(int ele:arr)
        {
            if(ele<min)
            {
                min = ele;
            }
        }
        System.out.println("Maximum element = "+min);
    }
}
