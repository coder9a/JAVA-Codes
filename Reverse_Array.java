import java.util.Scanner;

public class Reverse_Array
{
    public static void main(String[] args)
    {
        int sum = 0;
        int [] arr = {12,23,34,45,56,67,78,89,21,32};
        Scanner s = new Scanner(System.in);
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println("Array in reverse order");
        for(int i = arr.length-1; i>=0; i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
