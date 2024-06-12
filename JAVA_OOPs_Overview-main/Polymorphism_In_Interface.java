interface MyCamera2
{
    void takeSnap();
    void recordVideo();
    private void greet()
    {
        System.out.println("Good Morning");
    }
    default void record4Kvideo()
    {
        greet();
        System.out.println("Recording in 4K in interface");
    }
}
interface MyWifi2
{
    String[] getNetworks();
    void connectToNetwork(String Network);
}
class MyCellPhone2
{
    void CallNumber(int PhoneNumber)
    {
        System.out.println("Calling "+PhoneNumber);
    }
    void PickupCall()
    {
        System.out.println("Picking Call");
    }
}
class MySmartPhone2 extends MyCellPhone2 implements MyCamera2, MyWifi2
{
    public void takeSnap()
    {
        System.out.println("Taking Snap");
    }
    public void recordVideo()
    {
        System.out.println("Recording Video");
    }
    public String[] getNetworks()
    {
        System.out.println("Getting Network List");
        String[] networkList = {"Airtel, JIO, Idea"};
        return networkList;
    }
    public void connectToNetwork(String Network)
    {
        System.out.println("Connecting to "+Network);
    }
//    public void record4Kvideo()
//    {
//        System.out.println("Recording in 4k in class MySmartPhone");
//    }
}
class Polymorphism_In_Interfaces
{
    public static void main(String[] args)
    {
        MyCamera2 cam1 = new MySmartPhone2();
        cam1.record4Kvideo();
        cam1.takeSnap();
        //cam1.connectToNetwork();  -->> Not Allowed
        //MySmartPhone2 ms = new MySmartPhone2();
//        ms.recordVideo();
//        ms.record4Kvideo();
//        String[] ar = ms.getNetworks();
//        for(String item:ar)
//        {
//            System.out.println(item);
//        }
    }
}
