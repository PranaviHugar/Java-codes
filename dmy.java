class dmy
{
    int date,month,year;
    dmy(){date=1;month=1;year=2000;}
    dmy(int d,int m,int y)
    {
        date=d;
        month=m;
        year=y;
    }
    void Display()
    {
        System.out.println("date is:"+date+"-"+month+"-"+year);
    }
}
class Test2
{
    public static void main(String args[])
    {
        dmy b1=new dmy(12,11,2003);
        b1.Display();
    }
}


