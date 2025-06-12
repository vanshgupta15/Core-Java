package exceptionalHandling;

public class ThrowsExceptionHandling
{
    static void throwsException() throws Exception
    {
        System.out.println("Bomb is about to explode");
        throw new Exception("Bomb exploded");
    }

    public static void main(String[] args)
    {
        try
        {
            throwsException();
        }
        catch(Exception e)
        {
            System.out.println("Bomb exploded:"+e);
        }
        finally
        {
            System.out.println("Bomb handled");
        }
    }
}
