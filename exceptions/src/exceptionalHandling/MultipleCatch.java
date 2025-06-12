package exceptionalHandling;

public class MultipleCatch
{
    public static void main(String[] args) 
    {
        try
        {
            int a= args.length;
            System.out.println("a= "+a);
            int b=42/a;
            int c[]={15};
            c[42]=99;      
        }
        catch(ArithmeticException e)
        {
            System.out.println("Divide by zero: "+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index:"+e);
        }
    }
}