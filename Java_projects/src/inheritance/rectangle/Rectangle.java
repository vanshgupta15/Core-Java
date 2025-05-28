package inheritance.rectangle;

public class Rectangle 
{
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth)
    {
        System.out.println("Rectangle constructor called");
        this.length=length;
        this.breadth=breadth;
    }

    public int area()
    {
        System.out.println("Area of the rectangle called");
        return length*breadth;
    }

    //setter getter
    public int getLength()
    {
        return length;
    }
    public int setLength(int length)
    {
        this.length=length;
    }
 
}
