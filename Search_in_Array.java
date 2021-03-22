import java.util.Scanner;

public class Search_in_Array
{
    public static void main(String[] args)
    {
        int flag = 0,i=0;
        int [] arr = {12,23,34,45,56,67,78,89,21,32};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter element to be searched");
        int x = s.nextInt();
        for(i=0;i<10;i++)
        {
            if (arr[i] == x)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if (flag == 1)
        {
            System.out.println("Element found at position " + (i + 1));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}
