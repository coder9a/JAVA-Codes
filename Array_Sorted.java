public class Array_Sorted
    {
        public static void main(String[] args)
        {
            boolean isSorted = true;
            int [] arr = {12,23,34,45,56,67,78,89,21,32};
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i] > arr[i+1])
                {
                    isSorted = false;
                    break;
                }
            }
            if(isSorted)
                System.out.println("Array is Sorted");
            else
                System.out.println("Array is not sorted");
        }
    }

