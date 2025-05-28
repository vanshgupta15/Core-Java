package constructors;

public class RectangleDemo 
{
    public static void main(String[] args) 
    {
        Rectangle r1= new Rectangle();
        System.out.println("object with default constructor");
        System.out.println("Area of the rectangle1:"+r1.area());
        
        Rectangle r2= new Rectangle(30,20);
        System.out.println("Object with parametrized constructor");
        System.out.println("Area of the rectangle2: "+r2.area());

        Rectangle r3= new Rectangle();
        System.out.println("Area calculating through parameterized method");
        System.out.println("Area of the rectangle3: "+r3.area(15,15));

        System.out.println("Comparing two rectangles");
        if(r1.equalsTo(r2))
        {
            System.out.println("Both rectangles are equal");
        }
        else
        {
            System.out.println("Both rectangles are unequal");
        }
        //pass by reference example
        r1.changeReactangle(r2);
        {
            System.out.println("Value of length of r2:"+r2.length);
        }
        System.out.println("World ended");
    }
}
