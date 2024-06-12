/**
 * Given an array arr[] of positive integers of size N.
 * Reverse every sub-array group of size K.
 *
 *
 * Example 1:
 *
 * Input:
 * N = 5, K = 3
 * arr[] = {1,2,3,4,5}
 * Output: 3 2 1 5 4
 * Explanation: First group consists of elements
 * 1, 2, 3. Second group consists of 4,5.
 *
 *
 * Example 2:
 *
 * Input:
 * N = 4, K = 3
 * arr[] = {5,6,8,9}
 * Output: 8 6 5 9
 */

import java.util.*;

public class ReverseArrayListGroup
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arl = new ArrayList<>();
        arl.add(1);
        arl.add(2);
        arl.add(3);
        arl.add(4);
        arl.add(5);
        int n = arl.size();
        int k = 3,i=0;
        for (i=0;i<n;i+=k)
        {
            int start = i;
            int end = Math.min(i+k-1, n-1);
            while (start<=end)
            {
                Collections.swap(arl,start,end);
                start++;
                end--;
            }
        }
        for(i=0;i<n;i++)
        {
            System.out.print(arl.get(i)+" ");
        }
    }
}
