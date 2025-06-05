package inheritance.rectangle;

public class Box extends Rectangle
{
    private int depth;

    public Box(int length, int breadth, int depth)
    {
        super(length, breadth);
        System.out.println("box constructor called");
        this.depth= depth;
    }

    public int volume()
    {
        return super.area()*depth;
    }

    public int area()
    {
        System.out.println("Area of box called: ");
        return super.area()*depth;
    }
}
