import java.io.*;
public class SimpleWrite //we will use characters instead of converting to byte
{
    public static void main(String[] args) 
    {
        try 
        {
            FileWriter fw= new FileWriter("Writer.txt");
            fw.write("Namaste!! My name is Vansh Gupta");
            fw.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        System.out.println("Success......");
    }
}
