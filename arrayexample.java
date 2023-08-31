import java.util.Scanner;
public class arrayexample
{
    public static void main(String args[])
    {
        int a[]={24,67,78};
        for(int i=0;i<a.length;i++)
        {
            System.out.println("a["+i+"]="+a[i]);
        }
        Scanner s=new Scanner(System.in);
        System.out.println("Enter no of elements:");
        int n=s.nextInt();
        int b[]=new int[n];
        System.out.println("enter" +n+ "elements");
        for(int i=0;i<b.length;i++)
        {
            b[i]=s.nextInt();

        }
        for(int i=0;i<b.length;i++)
        {
            System.out.println("b["+i+"]="+b[i]);
        }
    }
}