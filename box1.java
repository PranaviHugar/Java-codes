package CLASSES_OBJECTS;
public class box1
{
    double l,br,h;
    box1(){l=br=h=1;}
    box1(double length, double breadth, double height){l=length;br=breadth;h=height;}
    box1(box1 b){l=b.l;br=b.br;h=b.h;}
    void computeArea()
    {
        System.out.println("Area="+(l*br));
    }
    void computeVolume()
    {
        System.out.println("volume="+(l*br*h));
    }
    class Test
    {
        public static void main(String args[])
        {
            box1 b1=new box1();
            System.out.println("Box 1 details:");
            System.out.println("length="+b1.l);
            System.out.println("breadth="+b1.br);
            System.out.println("height="+b1.h);
            b1.computeArea();
            b1.computeVolume();
            box1 b2=new box1(2,3,5);
            System.out.println("Box 2 details:");
            System.out.println("length="+b2.l);
            System.out.println("breadth="+b2.br);
            System.out.println("height="+b2.h);
            b2.computeArea();
            b2.computeVolume();
            box1 b3=new box1(b2);
            System.out.println("Box 3:");
            System.out.println("length="+b3.l);
            System.out.println("breadth="+b3.br);
            System.out.println("height="+b3.h);
            b3.computeArea();
            b3.computeVolume();
        }
    }
}