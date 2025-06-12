package exceptionalHandling;

public class HandleTheBomb 
{
    public static void main(String[] args) 
    {
        try
        {
        int a=10;
        int b=0;
        int c= a/b;
        System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            System.out.println("caught the bomb: "+e.getMessage());
        }
        System.out.println("World is safe now");
    }
}
