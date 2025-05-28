public class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
        System.out.println("Thread created: "+name);
    }

    public void run()
    {
        for (int i = 0; i < 10; i++) 
        {
            try
            {
                System.out.println("Thread "+Thread.currentThread().getName()+":"+i);
                Thread.sleep(1000);
            }
            catch(Exception e)
            {
                System.out.println("Exception :"+e);
            }
        }
    }
    
}
