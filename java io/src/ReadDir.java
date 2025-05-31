import java.io.File;

public class ReadDir 
{
    public static void main(String[] args) 
    {
        try
        {
            File file= new File("C:\\Vansh_codings\\codecoach");  //create new file object
            String paths[]= file.list();   //array of files and directly

            //for each name in path array
            for(String path:paths)
            {
                //prints filename and directory name
                System.out.println(path);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
