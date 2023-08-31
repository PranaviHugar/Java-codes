//reading user inputs using buffer reader(java.io)
import java.io;
public class Addnosbuff
{
     public static void main(String args[])
     {
     try
     {
        int a1,a2,sum=0;
        System.out.prinln("enter 2 nos");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));//new is used to initialise the object
        a1=Integer.parseInt(br.readline());
        a2=Integer.parseInt(br.readline());
        sum=a1+a2;
        System.out.println("sum="+sum);

     }
     catch(IOException e){}
     }
}

     //parseInt is static method of integer class,convert string into integer value
     //static members we use class name to call members
     //non static members we use 