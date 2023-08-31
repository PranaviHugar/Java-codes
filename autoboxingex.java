public class autoboxingex
{
    public static void main(String args[])
    {
        int a=5;
        Integer obj=a; //autoboxing
        System.out.println(obj);
        int k=obj; //auto-unboxing
        System.out.println("k="+k);    
    }
}