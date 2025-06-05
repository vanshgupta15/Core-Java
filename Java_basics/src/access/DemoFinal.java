package access;

public class DemoFinal 
{
    public static void main(String args[])
    {
        int a=100;
        a=200;
        System.out.println("a="+a);

        final int B=200;
        //b=100; //This will cause a complilation error bcoz of the final keyword
        System.out.println("b="+B);

        //real life example
        final float PI= 3.14f;
    }    
}
