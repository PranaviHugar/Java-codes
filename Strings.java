import java.util.StringTokenizer;
class Strings
{
    public static void main(String args[]);
    String message="Java is an OOP language";
    StringTokenizer str=new StringTokenizer(message," ");
    while(str.hasMoreTokens())
    {
        System.out.println(str.nextToken());
    }
}
