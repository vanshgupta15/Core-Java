package inheritance.studentDisplay;

public class Person 
{
    private String name;
    private int age;

    public Person()
    {

    }

    public Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }

    public void display()
    {
        System.out.println("Displaying person");
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
