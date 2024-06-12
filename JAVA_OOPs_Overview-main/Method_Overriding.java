class Alpha
{
    int a;
    public void meth1()
    {
        System.out.println("I'm method 1 of class Alpha");
    }
    public void meth2()
    {
        System.out.println("I'm method 2 of class Alpha");
    }
}
class Beta extends Alpha
{
    @Override
    public void meth2()
    {
        System.out.println("I'm method 2 of class Beta");
    }
    public void meth3()
    {
        System.out.println("I'm method 3 of class Beta");
    }
}
public class Method_Overriding
{
    public static void main(String[] args)
    {
        Alpha a = new Alpha();
        Beta b = new Beta();
        a.meth2();
        b.meth2();
        b.meth1();
    }
}
