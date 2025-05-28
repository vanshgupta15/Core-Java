package inheritance.rectangle;

public class DemoInheritance 
{
    public static void main(String[] args) 
    {
        Box b1= new Box(10,20,30);
        System.out.println("Volume of the box:"+b1.volume());
        System.out.println("Area of the box:"+b1.area());

        Rectangle r1= new Rectangle(20, 20);
        System.out.println("Area of the rectangle:"+r1.area());

        Rectangle r2= new Box(20,30,10);
        System.out.println("Area of the rectangle:"+r2.area());

    }
}
