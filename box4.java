public class box4
{
    double length,breadth,height;
    box4(){length=breadth=height=1;}
    box4(double l, double b, double h){length=l;breadth=b;height=h;}
    protected void finalize()
    {System.out.println("obj destroyed");}
}
class test3
{
    public static void main(String args[])
        {
            box4 b1=new box4();
            System.out.println("box1 details:");
            System.out.println("length="+b1.length);
            System.out.println("breadth="+b1.breadth);
            System.out.println("height="+b1.height);
            b1=null;
            System.gc();
        }
}