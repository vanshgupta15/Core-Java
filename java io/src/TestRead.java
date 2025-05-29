import java.io.FileInputStream;
import java.io.IOException;

public class TestRead //f2 dabake class ka naam rechange kar sakte hai
{
    public static void main(String[] args) 
    {
        FileInputStream in= null;
        try 
        {
            in = new FileInputStream("Data.txt");
            int i=0;
            while((i=in.read())!=-1)
            {
                System.out.print((char)i);
            }   
        } 
        catch (Exception ex) 
        {
            System.out.println(ex);
        } 
        finally {
            try {
                in.close();
            } catch (IOException ex) {
                System.out.println(ex);
            }
        }
    }
}
