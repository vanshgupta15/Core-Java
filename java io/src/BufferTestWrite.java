import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
public class BufferTestWrite 
{
    public static void main(String[] args) 
    {
        try{
        FileOutputStream fout=new FileOutputStream("BufferData.txt");
        BufferedOutputStream bout= new BufferedOutputStream(fout);
        String s= "Hello everyone........How are you";
        byte b[]= s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        System.out.println("Finished!!");
    }
}
