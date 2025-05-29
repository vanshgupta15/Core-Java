public class RunnableDemo 
{
    public static void main(String args[])
    {
        UsingRunnable obj1= new UsingRunnable("Vansh");
        Thread t1= new Thread(obj1);
        t1.start();
    }
}