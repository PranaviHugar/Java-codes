//generation of random nos using Math.random()
//Math.random() generates random value betn 0-1 and its floating point value
public class mathsprog
{
    public static void main(String args[])
    {
        System.out.println("Roll dice:");
        for(int i=0;i<6;i++)
        {
            double dice=Math.random()*(6-1)+1;
            //Math.random()*(max-min)+min---[min,max]
            System.out.println("dice outcome:"+Math.round(dice));//since it gives floating point values,round functn is used
        }
    }
}