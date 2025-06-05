package access;

public class Student
{
    private int rollNo;
    private String name;

    //default constructor
    Student() 
    {
        System.out.println("You are in default constructor");
        rollNo=0;
        name="unknown";
    }
    
    //parameterized constructor
    public Student(int r, String n) 
    {
        System.out.println("You are in paramaterized constructor");
        rollNo=r;
        name=n;
    }
    
    void display()
    {
        System.out.println("Roll no:"+rollNo);
        System.out.println("Name: "+name);
    }
}