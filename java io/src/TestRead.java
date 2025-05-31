import java.io.FileInputStream;

public class TestRead //f2 dabake class ka naam rechange kar sakte hai
{
    public static void main(String[] args) 
    {
        try 
        {
            FileInputStream in = new FileInputStream("Data.txt");
            int i=0;
            while((i=in.read())!=-1)
            {
                System.out.print((char)i);
            } 
            in.close();  
        } 
        catch (Exception ex) 
        {
            System.out.println(ex);
        } 
    }
}
