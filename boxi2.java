//if u hv same functions in base class n derived class n you hv to access base class thn we use super keyword
class boxi2
{
    double d1,d2;
    boxi2()
    {
        d1=d2=1;
    }
    void computeArea()
    {
        System.out.println("area="+(d1*d2));
    }
} 
class BoxHeight1 extends boxi2
{
    double d1;
    BoxHeight1()
    {
        d1=1;
    }
    BoxHeight1(double l,double b,double h)
    {
        super.d1=l;
        super.d2=b;
        d1=h;
    }
    void computeVolume()
    {
        System.out.println("vol="+(super.d1*d2*d1));
    }
    public static void main(String args[])
    {
        BoxHeight1 b1=new BoxHeight1(2,3,2);
        b1.computeArea();
        b1.computeVolume();
    }
}