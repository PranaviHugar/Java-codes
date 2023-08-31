class Date
{
    int date,month,year;
    Date(){date=1;month=1;year=2000;}
    Date(int d,int m,int y)
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
        Date b1=new Date(12,11,2003);
        b1.Display();
    }
}