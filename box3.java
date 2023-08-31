//static members of a  class are accessed using the class name
//classname.staticmembername 
//returning and passing objects to a function
public class box3
{
    double length,height,breadth;
    //default constructor
    box3(){length=height=breadth=1;}
    box3(double l,double b,double h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    static box3 addBoxes(box3 a,box3 b)
    {
        box3 c=new box3(box3 a,box3 b);

        c.length=a.length+b.length;
        c.breadth=a.length+b.breadth;
        c.height=a.height+b.height;
        return c;
    }
}
    
    class Test2
    {
        public static void main(String args[])
        {
            box3 b1=new box3(2,3,4);
            System.out.println("Box 1 details:");
            System.out.println("length="+b1.length);
            System.out.println("breadth="+b1.breadth);
            System.out.println("height="+b1.height);
            
            box3 b2=new box3(2,3,4);
            System.out.println("Box 2 details:");
            System.out.println("length="+b2.length);
            System.out.println("breadth="+b2.breadth);
            System.out.println("height="+b2.height);

            box3 b3=box3.addBoxes(b1,b2);
            System.out.println("Box 3 details:");
            System.out.println("length="+b3.length);
            System.out.println("breadth="+b3.breadth);
            System.out.println("height="+b3.height);
        }

    }
}