//generating random nos using Random class
import java.util.Random;
public class mathprog2
{
    public static void main(String args[])
    {
        System.out.println("Roll dice:");
        Random r=new Random();
        for(int i=0;i<6;i++)
        {
            System.out.println("dice outcome:"+(r.nextInt(6)+1));
            //random generates random nos from [0-(n-1)],therefore we added 1 to take even 6 value
        }
    }
}