package com.company;
class Base
{
    public int x;
    public int getX()
    {
        return x;
    }
    public void setX(int x)
    {
        this.x = x;
    }
}
class Derived extends Base
{
    public int y;
    public int getY()
    {
        return y;
    }
    public void setY(int y)
    {
        this.y = y;
    }
}
public class Inheritance
{
    public static void main(String[] args)
    {
        Base b = new Base();
        b.setX(12);
        System.out.println(b.getX());
        Derived d = new Derived();
        d.setY(23);
        System.out.println(d.getY());
        d.setX(45);
        System.out.println(d.getX());
    }
}
