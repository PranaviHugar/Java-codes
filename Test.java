abstract class shape2
{
    double d1,d2;
    void setDim(double dim1,double dim2)
    {
        d1=dim1;
        d2=dim2;
       
    }
     abstract void area();
    
}
class rect1 extends shape2
{
    void area()
    {
        System.out.println("area of rectangle="+(d1*d2));
    }
}
class triangle1 extends shape2
{
    void area()
    {
        System.out.println("area of triangle="+(0.5*d1*d2));
    }
}
public class Test
{
    public static void main(String args[])
    {
        shape2 s; //since abstract class has no objects we make use of object reference variable. Here s is object reference variable
        s=new triangle1();
        s.setDim(2,3);
        s.area();
        s=new rect1();
        s.setDim(1,2);
        s.area();
    }
}