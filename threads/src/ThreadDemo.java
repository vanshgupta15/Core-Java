public class ThreadDemo 
{
    public static void main(String[] args) 
    {
        MyThread t1= new MyThread("Hello");
        MyThread t2= new MyThread("Bye");

        t1.start();
        t2.start();

        System.out.println("Process ended");
    }
}
