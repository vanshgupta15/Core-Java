package interfacesDemo;

public class Documents implements  Printable,Sendable
{
    @Override
    public void print()
    {
        System.out.println("Printing document....");
    }
    public void send(String message)
    {
        System.out.println("Hello i am printing your document "+message);
    }
}
