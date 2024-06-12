interface SampleInterface
{
    void meth1();
    void meth2();
}
interface childSampleInterface extends SampleInterface
{
    void meth3();
    void meth4();
}
class MySampleInterface implements childSampleInterface
{
    public void meth1()
    {
        System.out.println("This is method 1 Sample Interface");
    }
    public void meth2()
    {
        System.out.println("This is method 2 Sample Interface");
    }
    public void meth3()
    {
        System.out.println("This is method 3 child Sample Interface");
    }
    public void meth4()
    {
        System.out.println("This is method 4 child Sample Interface");
    }
}
public class Inheritance_In_Interface
{
    public static void main(String[] args)
    {
        MySampleInterface obj = new MySampleInterface();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
