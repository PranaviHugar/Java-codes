import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class filewriterdemo
{
    public static void main(String args[])
    {
        try
        {
            File f=new File("file1.txt");
            FileWriter fw=new FileWriter(f);
            String source="Now is the time"+"for all good men";
            char buffer[]=new char[source.length()];
            source.getChars(0,source.length(),buffer,0);
            for(int i=0;i<buffer.length;i++)
            {
                fw.write(buffer[i]);
            }
            fw.close();
        }
        catch(IOException e)
        {
            System.out.println("IO erroe"+e);
        }
    }
}