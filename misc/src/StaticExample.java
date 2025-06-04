public class StaticExample 
{
    int instanceCount=0;
    static int staticCount=0;

    static 
    {
        System.out.println("Static block executed");
    }

    //constructor
    public StaticExample()
    {
        System.out.println("StaticExample constructor called");
        instanceCount++;
        staticCount++;
    }

    @Override
    public String toString()
    {
        return "{InstanceCount:"+instanceCount+" Static count:"+staticCount+"}";
    }
}
