
package cmdLineDemo;

public class CommandLineDemo 
{
    public static void main(String[] args) 
    {
        System.out.println("Length of the argument: "+args.length);

        System.out.println("Arguments are:-");

        for (int i = 0; i < args.length; i++) 
        {
            System.out.println(args[i]);
        }
    }
}
