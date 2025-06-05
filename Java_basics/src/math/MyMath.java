package math;
public class MyMath 
{
    int a;
    int b;
    //default constructor
    MyMath() 
    {
        System.out.println("You are in default constructor");
        a=10;
        b=10;
    }
    //parameterized constructor
    public MyMath(int c, int d) 
    {
        a = c;
        b = d;
    }
    //deafult function
    int sum()
    {
        return (a+b);
    }
    //parameterized function
    int sum(int f,int g)
    {
        return(f+g);
    }
}
