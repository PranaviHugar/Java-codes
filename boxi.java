
class boxi
{
    double breadth,length;
    boxi()
    {
        length=breadth=1;
    }
    boxi(double l,double b)
    {
        length=l;
        breadth=b;
    }
    void computeArea()
    {System.out.println("area="+(breadth*length));}
}
    class BoxHeight extends boxi
    {
        double height;
        BoxHeight(){height=1;}
        BoxHeight(double l,double b,double h)
        {
            super(l,b);               //super is used to call base class constructor
            height=h;
        }
        void computeVolume()
        {
            System.out.println("volume="+(length*breadth*height));
        }
        public static void main(String[] args)
        {
            BoxHeight b1=new 
            BoxHeight(2,2,2);
            b1.computeArea();
            b1.computeVolume();
        }
    }

