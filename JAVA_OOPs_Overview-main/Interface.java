
interface Bicycle
{
    int a=10;
    void applyBrake(int a);
    void SpeedUp(int b);
}
interface Tricycle
{
    int x=20;
    void applyPeddle();
}
class AvonCycle implements Bicycle, Tricycle
{
    void cycle()
    {
        System.out.println("This is cycle");
    }
    public void applyBrake(int a)
    {
        System.out.println("Apply Brake");
    }
    public void SpeedUp(int b)
    {
        System.out.println("Apply Speed Up");
    }
    public void applyPeddle()
    {
        System.out.println("Peddle the Tricycle");
    }
}
public class Interface
{
    public static void main(String[] args)
    {
        AvonCycle obj = new AvonCycle();
        obj.applyBrake(1);
        obj.cycle();
        System.out.println(obj.a);
        System.out.println(obj.x);
        obj.applyPeddle();
    }
}
