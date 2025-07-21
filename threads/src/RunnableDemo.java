public class RunnableDemo 
{
    public static void main(String args[])
    {
        UsingRunnable obj1= new UsingRunnable("Vansh");
        Thread t1= new Thread(obj1);
        t1.start();

        //using a lambda expression to implement runnable
        Runnable lamdaRunnable= ()->System.out.println("Running task using runnable");
        Thread t2= new Thread(lamdaRunnable);
        t2.start();
    }
}