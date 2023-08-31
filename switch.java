public class switch
{
    public static void main(String args[])
    {
        switch m="jan","feb","mar","april","may";
        switch(m)
        {
            case "jan":
            case "feb":
            case  "mar":
                 {System.out.println("spring");}
                 break;
            case "april":
            case "may":
                 {System.out.println("Summer");}
                 break;
        }
    }
}