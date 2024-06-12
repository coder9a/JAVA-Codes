/**
 *Given an array A[] of size N, construct a Product Array P (of same size N)
 * such that P[i] is equal to the product of all the elements of A except A[i].
 *
 *
 * Example 1:
 * Input:
 * N = 5
 * A[] = {10, 3, 5, 6, 2}
 * Output:
 * 180 600 360 300 900
 * Explanation:
 * For i=0, P[i] = 3*5*6*2 = 180.
 * For i=1, P[i] = 10*5*6*2 = 600.
 * For i=2, P[i] = 10*3*6*2 = 360.
 * For i=3, P[i] = 10*3*5*2 = 300.
 * For i=4, P[i] = 10*3*5*6 = 900.
 *
 * Example 2:
 * Input:
 * N = 2
 * A[] = {12,0}
 * Output:
 * 0 12
 */
public class ProductArrayPuzzle
{
    public static void main(String[] args)
    {
        int a [] = {10, 3, 5, 6, 2};
        int i,n,p=1;
        n = a.length;
        for (i=0;i<n;i++)
        {
            p = p*a[i];
        }
        for (i=0;i<n;i++)
        {
            System.out.print(p/(a[i])+" ");
        }
    }
}
