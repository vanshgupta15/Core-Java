package constructors;
public class Rectangle 
{
    int length;
    int width;
    //Default Constructor
    Rectangle() 
    {
        System.out.println("Default constructor");
        length=10;
        width=10;
    }
    //Parameterized Constructor
    public Rectangle(int l, int w) 
    {
        length=l;
        width=w;
    }
    int area()
    {
        System.out.println("Calculating area");
        return length*width;
    }
    int area(int l, int w)
    {
        System.out.println("Calculating area with parametreized method");
        return l*w;
    }
    boolean equalsTo(Rectangle r)
    {
        return (this.length==r.length && this.width==r.width);
    }

    //pass by reference 
    void changeReactangle(Rectangle r)
    {
        System.out.println("Changing Rectangle");
        r.length= 1000;
    }
}
