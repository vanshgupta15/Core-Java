import java.io.*;
public class SimpleRead //we are going to read these files without changing the 
{
    public static void main(String[] args) 
    {
        try {FileReader fr= new FileReader("Writer.txt");
        int i=0;
        while((i=fr.read())!=-1)
        {
            System.out.print((char)i);
        }
        fr.close();}
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
