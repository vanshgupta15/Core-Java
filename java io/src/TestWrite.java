import java.io.*;
public class TestWrite
{
    public static void main(String args[])
    {
        try 
        {
            FileOutputStream fout= new FileOutputStream("Data.txt");
            String s="Java is awesome. Even i am awesome";
            byte b[]=s.getBytes(); //converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("Success.......");
        } 
        catch (IOException ex) 
        {
            System.out.println(ex);
        }

    }
}