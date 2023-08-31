public class varargex2
{
    static void disp(object ...i)
    {
        
        for(int k:i)
        {
            if(k instanceof Integer)
            {
                System.out.println("Integer:"+k.toString());
            }
            if(k instanceof Double)
            {
                System.out.println("Double:"+k.toString());
            }
            if(k instanceof Character)
            {
                System.out.println("Character:"+k.toString());
            }
        }
    }
    public static void main(String args[])
    {
        System.out.println(varargex2.disp());
        
    }
}
    