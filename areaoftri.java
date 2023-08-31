import java.util.Scanner;
public class areaoftri
{
    public static void main(String args[])
    {
        
        double h=1, b,a=0;
        System.out.println("Enter breadth of triangle");
        Scanner s=new Scanner(System.in);
        b=s.nextDouble();
        a=0.5*b*h;
        System.out.println("area of triangle="+a);

    }
}