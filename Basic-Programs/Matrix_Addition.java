import java.util.Scanner;

public class Matrix_Addition
{
    public static void main(String[] args)
    {
        int flag = 0,i=0,j=0;
        int [][] m1 = new int[2][3];
        int [][] m2 = new int[2][3];
        int [][] m3 = new int[2][3];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter element of 1st matrix");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("A["+i+"]["+j+"] ");
                m1[i][j] = s.nextInt();
            }
            //System.out.println();
        }
        System.out.println("Enter element of 2nd matrix");
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print("B["+i+"]["+j+"] ");
                m2[i][j] = s.nextInt();
            }
            //System.out.println();
        }
        //Addition
        for(i=0;i<2;i++)
        {
            for(j=0;j<3;j++)
            {
                m3[i][j] = m1[i][j] + m2[i][j];
            }
        }
        // Printing the matrix
        for(i=0;i<2;i++)
        {
            for (j = 0; j < 3; j++)
            {
                System.out.print(m3[i][j]+" ");
            }
            System.out.println();
        }
    }
}
