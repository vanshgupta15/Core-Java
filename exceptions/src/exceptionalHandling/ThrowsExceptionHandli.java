package exceptionalHandling;

public class ThrowsExceptionHandli
{
    static void throwsException() throws Exception
    {
        System.out.println("Bomb is about to explode");
        throw new Exception("Bomb exploded");
    }

    public static void main(String[] args) throws Exception
    {
        throwsException();
    }
}
