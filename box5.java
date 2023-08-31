public class box5
{
    static double length,breadth;
    final static double height;//to declare constants we use final
    static {height=1;length=1;}
    static void viewData()
    {
        System.out.println("length="+box5.length);
        System.out.println("breadth="+box5.breadth);
        System.out.println("height="+box5.height);
    }
    public static void main(String args[])
        {
            box5.viewData();
            
        }
}