package exceptionalHandling;

public class ThrowExceptionHandling 
{
    public static void main(String[] args) 
    {
        try
        {
            System.out.println("Bomb is about to explode");
            throw new Exception("Bomb exploded");
        }
        catch(Exception e)
        {
            System.out.println("Bomb exception handled:"+e);
        }
        finally
        {
            System.out.println("Bomb finally handled");
        }
    }
}
