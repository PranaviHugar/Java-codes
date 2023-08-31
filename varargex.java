public class varargex
{
    static int sum(int ...i)
    {
        int s=0;
        for(int k:i)
        {
            s+=k;
        }
        return s;
        
    }
    public static void main(String args[])
    {
        System.out.println(varargex.sum(1,1,1,1,1));
        System.out.println(varargex.sum(1,1,1));
    }
}
//object class is considered as parent class of all java inbuilt class and user class