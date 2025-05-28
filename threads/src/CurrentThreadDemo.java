public class CurrentThreadDemo
{
    public static void main(String args[])
    {
        Thread t= Thread.currentThread();
        System.out.println("Current thread:"+t);
        t.setName("My thread");
        System.out.println("After name change:"+t);
        try
        {
            for(int i=10; i>=0; i--)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception:"+e);
        }
        System.out.println("Exiting "+t);
    }
}