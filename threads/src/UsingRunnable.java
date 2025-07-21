public class UsingRunnable implements Runnable
{

    //old style runnable
    String owner;
    UsingRunnable(String own)
    {
        System.out.println("Thread interface constructor");
        owner=own;
    }
    public void run()
    {
        try
        {
            for (int i = 0; i < 10; i++) 
            {
                System.out.println(owner+"Running at i= "+i);
                Thread.sleep(1000);
            }
        }
        catch(Exception e)
        {
            System.out.println("Exception:"+e);
        }
    }
}