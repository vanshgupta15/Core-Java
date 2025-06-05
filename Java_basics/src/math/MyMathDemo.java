package math;
import java.util.Scanner;
public class MyMathDemo 
{
    public static void main(String[] args) 
    {
        MyMath s1= new MyMath();
        System.out.println("Sum of default a and b:"+s1.sum());
        System.out.println("Sum of parameterized function:"+s1.sum(2, 3));

        MyMath s2= new MyMath(20,30);
        System.out.println("Sum of parameterized a and b:"+s2.sum());
        System.out.println("Sum of parameterized constructor and function:"+s2.sum(100, 200));

        MyMath s3= new MyMath();
        Scanner sc= new Scanner(System.in);
        System.out.println("Previous values of a and b"+s3.a+" "+s3.b);
        System.out.println("Enter the value of a:");
        int x= sc.nextInt();
        System.out.println("Enter the value of b:");
        int y= sc.nextInt();
        System.out.println("Sum 3:"+s3.sum(x,y));
    }
}