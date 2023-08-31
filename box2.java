//not static data members are called as instance variables of java
//local variables take precedence over instance variables if local and instance variables have same name
//for that purpose we use this(keyword) to refer to intance variables of class

public class box2
{
    double length,height,breadth;
    //default constructor
    box2(){length=height=breadth=1;}
    box2(double length,double breadth,double height)
    {
        this.length=length;
        this.breadth=breadth;
        this.height=height;
    }
    box2(box2 b)
    {
        length=b.length;
        breadth=b.breadth;
        height=b.height;
    }

    void computeArea()
    {
         System.out.println("Area="+(length*breadth));
    }
    void computeVolume()
    {
        System.out.println("volume="+(length*breadth*height));
    }
    class Test1
    {
        public static void main(String args[])
        {
            box2 b1=new box2(2,3,4);
            System.out.println("Box 2 details:");
            System.out.println("length="+b1.length);
            System.out.println("breadth="+b1.breadth);
            System.out.println("height="+b1.height);
            b1.computeArea();
            b1.computeVolume();
        }

    }
}