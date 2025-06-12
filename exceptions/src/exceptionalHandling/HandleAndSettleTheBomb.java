package exceptionalHandling;

public class HandleAndSettleTheBomb 
{
    public static void main(String[] args) 
    {
        try
        {
        System.out.println("Bomb is about to explode");
        int a=10;
        int b=0;
        int c= a/b;
        System.out.println(c);
        }
        catch(Exception e)
        {
            System.out.println("caught the bomb: "+e.getMessage());
        }
        finally
        {
            System.out.println("Finally bomb settled");
        }
        System.out.println("World is safe now");
    }
}
