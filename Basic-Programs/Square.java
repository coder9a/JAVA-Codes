import java.util.Scanner;
import java.lang.Math;
class Square_Details
{
    int side;
    public int getPerimeter()
    {
        return 4*side;
    }
    public int getArea()
    {
        return side*side;
    }
    public double getDiagonal()
    {
        return 2*(Math.sqrt(side));
    }
}
public class Square
{
    public static void main(String[] args)
    {
        Square_Details squareObject = new Square_Details();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter side of square");
        int x = s.nextInt();
        squareObject.side = x;
        System.out.println("Area of square = "+squareObject.getArea());
        System.out.println("Perimeter of square = "+squareObject.getPerimeter());
        System.out.println("Diagonal of square = "+squareObject.getDiagonal());
    }
}
